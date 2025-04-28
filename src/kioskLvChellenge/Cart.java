package kioskLvChellenge;

import java.util.Map;

public class Cart implements ListMain {

    void cartListPrint() {
        System.out.println("[ 장바구니 내역 ]");

        for (Map.Entry<String, Double> test : cartItems.entrySet()) {
            System.out.print("음식 : " + test.getKey());
            System.out.println("가격 : " + test.getValue());
        }
        /*System.out.println("음식 : " + cartItems.keySet() + "*" + countNum + " | W " + cartItems.values());
        System.out.println();*/
    }

    void totalPay() {
        double num =0;
        for (Double value : cartItems.values()) {
            num += value;
        }

        // %.1f double로 더하는데 뒤에 이상한 값이 나와서 소숫점 1의 자리까지만 출력하도록 제한을 둠
        System.out.printf("총 금액 : %.1f\n", num);
    }
}
