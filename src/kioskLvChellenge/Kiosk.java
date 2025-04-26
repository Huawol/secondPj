package kioskLvChellenge;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Kiosk implements ListMain {
    // 메인문에서 실행할 클래스
    void run() {
        int num1 = 0;
        Food food = new Food();
        food.burger();
        food.dessert();
        food.drink();
        do {
            System.out.print("""
                    [ SHAKESHACK MENU ]
                    1. Hamburger
                    2. Drink
                    3. Dessert
                    0.   종료    
                    choice : """);
            try {
                num1 = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요");
            }

            switch (num1) {
                case 1:
                    food.printFood();
                    food.selectFood();
                    break;
                case 2:
                    food.printFood();
                    food.selectFood();
                    break;
                case 3:
                    food.printFood();
                    food.selectFood();
                    break;
                case 0:
                    System.out.println("종료됩니다.");
                    break;
                default:
                    System.out.println("숫자를 다시 입력해주세요");
            }
        }
        while (0 != num1);
    }
}
