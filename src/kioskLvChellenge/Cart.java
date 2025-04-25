package kioskLvChellenge;

public class Cart implements ListMain{

    void cartLists() {
        System.out.println("[ 장바구니 내역 ]");
        for (String cartItem : cartItems) {
            System.out.println(cartItem);
        }
        System.out.println();
    }


}
