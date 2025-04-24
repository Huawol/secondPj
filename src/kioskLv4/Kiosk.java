package kioskLv4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 메뉴,입력을 관리하는 클래스
    void run() {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        List<MenuItem> menuItems = new ArrayList<>();
        Menu menu = new Menu();

        do {
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. Hamburger");
            System.out.println("2. Drink");
            System.out.println("3. Dessert");
            System.out.println("0.   종료    ");
            System.out.print("choice : ");

            try {
                num1 = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요");
                return; // 두번째 실행결과에서 이거 안쓰면 한번 더 돌고 끝남
            }

            switch (num1) {
                case 1:
                    menu.burgerLists();
                    break;

                case 2:
                    menu.drinkLists();
                    break;

                case 3:
                    menu.dessertLists();
                    break;
                default:
                    System.out.println("숫자를 다시 입력해주세요");
            }
        }
        while (0 != num1);
    }
}
