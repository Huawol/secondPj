package kioskLvChellenge;

import java.util.Map;

public class Cart implements ListMain {

    void cartListPrint() {
        System.out.println("[ 장바구니 내역 ]");
        for (Map.Entry<String, Double> test : cartItems.entrySet()) {
            System.out.println("음식 : " + test.getKey() + ", 가격 : " + test.getValue());
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
        int select = scanner.nextInt();
        if (select == 1) {
            System.out.println("주문이 완료 되었습니다. 금액은 " + num + "입니다");
            cartItems.clear();
        }
    }

    /*public void disCountPay() {

    }*/
}
