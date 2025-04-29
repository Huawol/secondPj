package kioskLvChellenge;

import java.util.Map;

public class Cart implements ListMain {
    int select = 0;

    void cartListPrint() {
        System.out.println("[ 장바구니 내역 ]");
        for (Map.Entry<String, Double> test : cartItems.entrySet()) {
            System.out.println("음식 : " + test.getKey() + ", 가격 : " + test.getValue());
        }
    }

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
            /*for (String key : cartItems.keySet()) {
                if (cartItems.containsKey(key)) {*/
            countDuplication.put(name, countDuplication.getOrDefault(name, 0) + 1);
            System.out.println("[ 장바구니에 담긴 음식 ]");
            cartEdit();
                /*}
            }*/
            /*System.out.println("map = " + countDuplication.values());
            System.out.println("[ 장바구니에 담긴 내용 ] \n" + countDuplication.keySet()
                    + "*" + countDuplication.values());*/
        }
    }

    public void cartEdit() {
        for (Map.Entry<String, Integer> stringIntegerEntry : countDuplication.entrySet()) {
            String name = stringIntegerEntry.getKey();
            int count = stringIntegerEntry.getValue();

            System.out.println(count + " | "+name);
        }
    }

    public void totalPay() {
        double num = 0;
        for (Double value : cartItems.values()) {
            num += value;
        }
        // %.1f double로 더하는데 뒤에 이상한 값이 나와서 소숫점 1의 자리까지만 출력하도록 제한을 둠
        System.out.printf("총 금액 : %.1f%n", num);

        System.out.print("""
                결제하시겠습니까?
                1.결제 하기 2. 뒤로 가기 : """);
        select = scanner.nextInt();
        if (select == 1) {
            disCountPay(num);
            cartItems.clear();
        }
    }

    public void disCountPay(double totalprice) {
        System.out.print("""
                할인 정보를 입력해주세요
                1. 국가유공자 : 10%
                2. 군인     :  5%
                3. 학생     :  3%
                4. 일반     :  0%
                ====== 선택 : """);
        select = scanner.nextInt();
        switch (select) {
            case 1 -> System.out.println("국가 유공자 할인이 적용되었습니다. 금액 : " + (totalprice * 0.9));
            case 2 -> System.out.println("군인 할인이 적용되었습니다. 금액 : " + (totalprice * 0.95));
            case 3 -> System.out.println("학생 할인이 적용되었습니다. 금액 : " + (totalprice * 0.97));
            case 4 -> System.out.println("결제 되었습니다. 금액 : " + totalprice);
            default -> System.out.println("다른걸 입력하셨습니다.");
        }
    }
}
