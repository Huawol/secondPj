package kioskLvChellenge;

import java.util.Scanner;

public class Select implements ListMain {
    Scanner scanner = new Scanner(System.in);
    int num1 = 0;
    Cart cart = new Cart();


    void selectBFood() {
        int i = 0;
        System.out.print("메뉴를 선택해주세요 : ");
        num1 = scanner.nextInt();
        for (int j = 0; j <= menuItems.size(); j++) {
            i++;
            if (num1 == i) {
                System.out.println("""
                        
                        [ 선택된 메뉴 ]""");
                System.out.println(i + ". " + menuItems.get(j).getName()
                        + " | W " + menuItems.get(j).getPrice() + " | "
                        + "설명 : " + menuItems.get(j).getExplanation());

                cartItems.add(menuItems.get(j)); // cartItems에 menuItems리스트를 .get(j)해서 j번째꺼를 가져온 다음에 추가함
                cart.cartLists(); // cart 클래스에 메뉴 저장하는 메소드
                cart.totalPay(); // 금액 합

            } else if (num1 == i - 1) { // 0을 입력 받으면 kiosk 클래스로 돌아감, 그때 불러온 리스트는 초기화
                menuItems.clear();

            }
        }
    }
}
