package kioskLvChellenge;


import kioskLvChellenge.food.BugerList;
import kioskLvChellenge.food.DessertList;
import kioskLvChellenge.food.DrinkList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kiosk implements ListMain{
    // TODO 메인문에서 실행할 클래스
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

            menuItems.clear();
            switch (num1) {
                case 1:
                    bugerList.getBurgerLists();
                    select.selectBFood();
                    break;
                case 2:
                    drinkList.getDrinkList();
                    select.selectBFood();
                    break;
                case 3:
                    dessertList.getDessertLists();
                    select.selectBFood();
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
