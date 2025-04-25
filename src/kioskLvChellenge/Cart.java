package kioskLvChellenge;

public class Cart implements ListMain {
    double num1 = 0;
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
    }


}
