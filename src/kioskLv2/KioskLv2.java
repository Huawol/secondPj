package kioskLv2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class KioskLv2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        List<MenuItem> menuItems = new ArrayList<>();

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
            }

            if (num1 == 1) {
                MenuItem menuItem = new MenuItem("ShackBurger",6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                MenuItem menuItem1 = new MenuItem("SmokeShack",8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                MenuItem menuItem2 = new MenuItem("Cheeseburger",6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                MenuItem menuItem3 = new MenuItem("Hamburger",5.4,"비프패티를 기반으로 야채가 들어간 기본버거");
                menuItems.add(menuItem);
                menuItems.add(menuItem1);
                menuItems.add(menuItem2);
                menuItems.add(menuItem3);

                for (MenuItem burger : menuItems) {
                    System.out.println("메뉴 : " + burger.name);
                    System.out.println("가격 : " + burger.price);
                    System.out.println("설명 : " + burger.explanation);
                }

            } else if (num1 == 2) {

                MenuItem menuItem = new MenuItem("콜라",2.0,"콜라는 역시 코카콜라!");
                MenuItem menuItem1 = new MenuItem("사이다",2.0,"사이다는 역시 칠성!");
                MenuItem menuItem2 = new MenuItem("제로 콜라",2.5,"제로 콜라는 역시 펩시!");
                MenuItem menuItem3 = new MenuItem("제로 사이다",2.5,"제로 사이다는 역시 칠성!");
                menuItems.add(menuItem);
                menuItems.add(menuItem1);
                menuItems.add(menuItem2);
                menuItems.add(menuItem3);

                for (MenuItem burger : menuItems) {
                    System.out.println("메뉴 : " + burger.name);
                    System.out.println("가격 : " + burger.price);
                    System.out.println("설명 : " + burger.explanation);
                }

            } else if (num1 == 3) {

                MenuItem menuItem = new MenuItem("감자튀김",4.0,"바삭하고 짭짤한 감자튀김");
                MenuItem menuItem1 = new MenuItem("치즈 감자튀김",4.5,"치즈에 빠진 바삭 짭짤 감자튀김");
                MenuItem menuItem2 = new MenuItem("버팔로 윙",3.0,"오븐에 구운듯한 닭날개");
                MenuItem menuItem3 = new MenuItem("세트",6.9,"감자튀김과 버팔로 윙을 한번에!");
                menuItems.add(menuItem);
                menuItems.add(menuItem1);
                menuItems.add(menuItem2);
                menuItems.add(menuItem3);

                for (MenuItem burger : menuItems) {
                    System.out.println("메뉴 : " + burger.name);
                    System.out.println("가격 : " + burger.price);
                    System.out.println("설명 : " + burger.explanation);
                }

            } else if (num1 != 0) {
                System.out.println("다른 번호를 입력하셨습니다.");
            }

        } while (0 != num1);
    }
}
