/*
package kioskLvChellenge;

import java.util.Scanner;

public class Select implements ListMain{

    private int num1 = 0;



    void selectFood() {
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


            }
        }
        cartItems.add(menuItems.get()); // cartItems에 menuItems리스트를 .get(j)해서 j번째꺼를 가져온 다음에 추가함
        cart.cartLists(); // cart 클래스에 메뉴 저장하는 메소드
        cart.totalPay();
    }
}
*/
