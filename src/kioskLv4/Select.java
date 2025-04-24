package kioskLv4;

import java.util.Scanner;

public class Select extends Menu{
    Scanner scanner = new Scanner(System.in);
    int num1 = 0;
    void selectFood() {
        int i=0;
        System.out.print("메뉴를 선택해주세요 : ");
        num1 = scanner.nextInt();
        if (num1 == menuItems.size()) {
            for (MenuItem food : menuItems) {
                i++;
                System.out.println(i+". "+food.name + " | W " + food.price + " | " + food.explanation);
            }
        }
    }
}
