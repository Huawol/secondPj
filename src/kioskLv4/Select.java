package kioskLv4;

import java.util.Scanner;

public class Select implements ListMain{
    Scanner scanner = new Scanner(System.in);
    int num1 = 0;


    void selectBFood() {
        int i=0;
        System.out.print("메뉴를 선택해주세요 : ");
        num1 = scanner.nextInt();
        for(int j=0; j<4; j++) {
            i++;
            if (num1 == i) {
                System.out.println(i + ". "+ menuItems.get(j).getName() + " | W " + menuItems.get(j).getPrice() + " | " + "설명 : " + menuItems.get(j).getExplanation());
            }
        }
        menuItems.clear();
    }
}
