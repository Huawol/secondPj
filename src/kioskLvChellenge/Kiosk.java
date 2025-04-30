package kioskLvChellenge;

import java.util.InputMismatchException;


public class Kiosk implements ListMain {
    // 메인문에서 실행할 클래스
    void run() {
        int num1 = 0;

        Cart cart = new Cart();
        Food food = new Food(cart);
        food.foodcategory();

        do {
            mainPrint();
            try {
                num1 = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요");
            }
            System.out.println();

            switch (num1) {
                case 1:
                    food.printFood("burger");
                    food.selectFood("burger");
                    break;
                case 2:
                    food.printFood("drink");
                    food.selectFood("drink");
                    break;
                case 3:
                    food.printFood("dessert");
                    food.selectFood("dessert");
                    break;
                case 0:
                    System.out.println("종료됩니다.");
                    break;
                case 4:
                    cart.cartPrintEdit(); // 장바구니 메서드
                    break;
                case 5:
                    cart.totalPay(); // 결제 메서드
                    break;
                default:
                    System.out.println("숫자를 다시 입력해주세요");
            }
        }
        while (0 != num1);
    }

    // 메뉴출력문
    void mainPrint() {

        if (!cartItems.isEmpty()) { // 장바구니가 안비어있으면 출력
            System.out.print("""
                    
                    [ SHAKESHACK MENU ]
                    1. Hamburger
                    2. Drink
                    3. Dessert
                    4. 장바구니
                    5. 결제
                    0.   종료    
                    choice : """);
        } else {
            System.out.print("""
                    
                    [ SHAKESHACK MENU ]
                    1. Hamburger
                    2. Drink
                    3. Dessert
                    0.   종료    
                    choice : """);
        }
    }
}
