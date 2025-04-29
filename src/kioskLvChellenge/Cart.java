package kioskLvChellenge;

import java.util.Map;

public class Cart implements ListMain {
    private int select = 0;
    double sumResult;


    // 장바구니에 담을지 말지 고민하는 메서드
    void cartAdd(String name, double price) {
        System.out.print("""
                장바구니에 담겠습니까?
                1. 예 2. 아니오
                ====== 선택 :""");
        select = scanner.nextInt();

        if (select == 1) {
            System.out.println("""
                    장바구니에 추가되었습니다!!
                    """);
            cartItems.put(name, price);
            countDuplication.put(name, countDuplication.getOrDefault(name, 0) + 1);
            System.out.println("[ 장바구니에 담긴 음식 ]");
            cartPrintEdit();
        }
    }

    public void cartPrintEdit() {
        sumResult = 0;
        for (Map.Entry<String, Integer> countDuplication : countDuplication.entrySet()) {
            String name = countDuplication.getKey();
            int count = countDuplication.getValue();
            double a = cartItems.get(name);
            System.out.printf(count + " | " + name + " : %.2f%n", count * a);
            sumResult += count * a;
        }
        System.out.printf("총 금액 : %.1f%n", sumResult);
    }

    // 5번(결제버튼) 누르면 실행됨
    public void totalPay() {

        // %.1f double로 더하는데 뒤에 이상한 값이 나와서 소숫점 1의 자리까지만 출력하도록 제한을 둠

        System.out.println(sumResult);
        System.out.print("""
                결제하시겠습니까?
                1.결제 하기 2. 뒤로 가기 :""");
        select = scanner.nextInt();
        if (select == 1) {
            disCountPay();
            cartItems.clear();
            countDuplication.clear();
        }
    }

    public void uiPay() {
        for (Map.Entry<String, Integer> countDuplication : countDuplication.entrySet()) {
            String name = countDuplication.getKey();
            int count = countDuplication.getValue();
            double a = cartItems.get(name);
            System.out.println(count + " | " + name + ": " + a);
        }
    }

    public void disCountPay() {
        double totalprice = sumResult;
        System.out.print("""
                할인 정보를 입력해주세요
                1. 국가유공자 : 10%
                2. 군인     :  5%
                3. 학생     :  3%
                4. 일반     :  0%
                ====== 선택 :""");
        select = scanner.nextInt();
        switch (select) {
            case 1 -> System.out.printf("국가 유공자 할인이 적용되었습니다. 금액 : %.2f%n", totalprice * 0.9);
            case 2 -> System.out.printf("군인 할인이 적용되었습니다. 금액 : %.2f%n", totalprice * 0.95);
            case 3 -> System.out.printf("학생 할인이 적용되었습니다. 금액 : %.2f%n", totalprice * 0.97);
            case 4 -> System.out.println("일반 결제 되었습니다. 금액 : " + totalprice);
            default -> System.out.println("다른걸 입력하셨습니다.");
        }
    }
}
