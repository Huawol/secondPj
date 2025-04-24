package kioskLv1;

import java.util.Scanner;

public class Kiosk {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        do {
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger");
            System.out.println("2. SmokeShack");
            System.out.println("3. Cheeseburger");
            System.out.println("4. Hamburger");
            System.out.println("0.   종료    ");
            System.out.print("choice : ");
            num1 = scanner.nextInt();

            if (num1 == 1) {
                System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            } else if (num1 == 2) {
                System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            } else if (num1 == 3) {
                System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            } else if (num1 == 4) {
                System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            }

        } while (0 != num1);

    }
}
