package kioskLv4;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Kiosk {
    // 메뉴,입력을 관리하는 클래스
    void run() {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        BugerList bugerList = new BugerList();
        DrinkList drinkList = new DrinkList();
        DessertList dessertList = new DessertList();
        Select select = new Select();

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
                return; // 두번째 실행결과에서 이거 안쓰면 한번 더 돌고 끝남
            }

            switch (num1) {
                case 1:
                    bugerList.burgerLists();
                    select.selectBFood();
                    break;
                case 2:
                    drinkList.drinkLists();
                    select.selectBFood();
                    break;
                case 3:
                    dessertList.dessertLists();
                    select.selectBFood();
                    break;
                default:
                    System.out.println("숫자를 다시 입력해주세요");
            }
        }
        while (0 != num1);
    }
}
