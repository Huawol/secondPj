package kioskLv4;

import java.util.Scanner;

public class Select implements ListMain{
    Scanner scanner = new Scanner(System.in);
    int num1 = 0;
    Kiosk kiosk = new Kiosk();


    Kiosk selectBFood() {
        int i=0;
        System.out.print("메뉴를 선택해주세요 : ");
        num1 = scanner.nextInt();
        for(int j=0; j<4; j++) {
            i++;
            if (num1 == i) {
                System.out.println(i + ". "+ menuItems.get(j).getName() + " | W " + menuItems.get(j).getPrice() + " | " + "설명 : " + menuItems.get(j).getExplanation());
            } else if (num1 == i-1) { // 0을 입력 받으면 kiosk 클래스로 돌아감, 그때 리스트는 초기화
                menuItems.clear();
                return kiosk;

            }
        }
        menuItems.clear();
        return null;
    }
}
