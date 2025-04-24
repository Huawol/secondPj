package kioskLv1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KioskLv1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
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
                String hamPrintMenu = """
                        [ SHAKESHACK MENU ]
                        1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
                        2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
                        3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
                        4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
                        """;
                System.out.println(hamPrintMenu);

            } else if (num1 == 2) {
                String drinkPrintMenu = """
                        [ DRINK MENU ]
                        1. 콜라   | W 2.0 | 콜라는 역시 코카콜라!
                        2. 사이다    | W 2.0 | 사이다는 역시 칠성!
                        3. 제로 콜라  | W 2.5 | 제로 콜라는 역시 펩시!
                        4. 제로 사이다     | W 2.5 | 제로 사이다는 역시 칠성!
                        """;
                System.out.println(drinkPrintMenu);

            } else if (num1 == 3) {
                String dessertPrintMenu = """
                        [ DESSERT MENU ]
                        1. 감자튀김   | W 4.0 | 바삭하고 짭짤한 감자튀김
                        2. 치즈 감자튀김    | W 4.5 | 치즈에 빠진 바삭 짭짤 감자튀김
                        3. 버팔로 윙  | W 3.0 | 오븐에 구운듯한 닭날개
                        4. 세트     | W 6.9 | 감자튀김과 버팔로 윙을 한번에!
                        """;
                System.out.println(dessertPrintMenu);

            } else if (num1 != 0) {
                System.out.println("다른 번호를 입력하셨습니다.");
            }

        } while (0 != num1);
    }
}
