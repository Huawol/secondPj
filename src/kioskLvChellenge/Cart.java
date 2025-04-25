package kioskLvChellenge;

public class Cart implements ListMain {
    private double num1 = 0;

    void cartLists() {
        System.out.println("[ 장바구니 내역 ]");
        for (MenuItem cartItem : cartItems) {
            System.out.println("음식 : " + cartItem.getName() + " | W " + cartItem.getPrice());
            num1 += cartItem.getPrice();
        }
        System.out.println();
    }

    void totalPay() {
        System.out.printf("총 금액 : %.1f\n"  ,num1);
        // %.1f double로 더하는데 뒤에 이상한 값이 나와서 소숫점 1의 자리까지만 출력하도록 제한을 둠
    }


}
