package kioskLvChellenge;

import java.util.HashMap;
import java.util.Map;

public class Food implements ListMain { // 음식의 객체를 담을 리스트
    Map<String, Integer> map = new HashMap<>();

    public void burger() {
        menuItems.add(new MenuItem("burger", "ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("burger", "Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("burger", "SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("burger", "Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    public void drink() {
        menuItems.add(new MenuItem("drink", "콜라", 2.0, "콜라는 역시 코카콜라!"));
        menuItems.add(new MenuItem("drink", "사이다", 2.0, "사이다는 역시 칠성!"));
        menuItems.add(new MenuItem("drink", "제로 콜라", 2.5, "제로 콜라는 역시 펩시!"));
        menuItems.add(new MenuItem("drink", "제로 사이다", 2.5, "제로 사이다는 역시 칠성!"));
    }

    public void dessert() {
        menuItems.add(new MenuItem("dessert", "감자튀김", 4.0, "바삭하고 짭짤한 감자튀김"));
        menuItems.add(new MenuItem("dessert", "치즈 감자튀김", 4.5, "치즈에 빠진 바삭 짭짤 감자튀김"));
        menuItems.add(new MenuItem("dessert", "버팔로 윙", 3.0, "오븐에 구운듯한 닭날개"));
        menuItems.add(new MenuItem("dessert", "세트", 6.9, "감자튀김과 버팔로 윙을 한번에!"));
    }

    // 출력 메소드
    public void printFood(String category) {
        int i = 0;
        System.out.println("[ MENU ]");
        for (MenuItem printFood : menuItems) {
            if (printFood.getCategory().equals(category)) { // 선택한 메뉴에 맞는거만 출력
                i++;
                System.out.println(i + ". " + printFood.getName() + " | W " + printFood.getPrice() + " | " + "설명 : " + printFood.getExplanation());
            }
        }
        System.out.println("0. 뒤로가기");
    }

    // 선택 메소드
    public void selectFood(String category) {
        int i = 0;
        int num1;

        System.out.print("메뉴를 선택해주세요 : ");
        num1 = scanner.nextInt();

        if (num1 == 0) { // 0 누르면 카테고리 메뉴로 돌아감
            return;
        }

        for (MenuItem selectFood : menuItems) {

            if (selectFood.getCategory().equals(category)) {
                i++;
                if (num1 == i) {
                    System.out.println("""
                            
                            [ 선택된 메뉴 ]""");

                    System.out.println(i + ". " + selectFood.getName()
                            + " | W " + selectFood.getPrice() + " | "
                            + "설명 : " + selectFood.getExplanation());

                    ////////// 장바구니 기능 /////////
                    System.out.print("""
                            장바구니에 담겠습니까?
                            1. 예 2. 아니오
                            ====== 선택 :""");
                    int select = scanner.nextInt();
                    if (select == 1) {
                        cartItems.put(selectFood.getName(), selectFood.getPrice());
                        System.out.println("""
                                장바구니에 추가되었습니다!!
                                """);
                        for (String key : cartItems.keySet()) {
                            if (selectFood.getName().equals(key)) {
                                map.put(key, map.getOrDefault(key,  0) + 1);
                            }
                        }
                        System.out.println("map = " + map);
                        return;
                    } else if (select == 2) {
                        return;
                    }
                }
            }
        }
    }
}
