package kioskLv4;

import java.util.ArrayList;
import java.util.List;

public class Menu implements ListMain{
    // 리스트 관리 클래스



    void burgerLists() {
        int i = 0;
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        for (MenuItem food : menuItems) {
            i++;
            System.out.println(i+". "+food.name + " | W " + food.price + " | " + food.explanation);
        }
    }
    void drinkLists() {
        int i = 0;
        menuItems.add(new MenuItem("콜라", 2.0, "콜라는 역시 코카콜라!"));
        menuItems.add(new MenuItem("사이다", 2.0, "사이다는 역시 칠성!"));
        menuItems.add(new MenuItem("제로 콜라", 2.5, "제로 콜라는 역시 펩시!"));
        menuItems.add(new MenuItem("제로 사이다", 2.5, "제로 사이다는 역시 칠성!"));

        for (MenuItem food : menuItems) {
            i++;
            System.out.println(i+". "+food.name + " | W " + food.price + " | " + food.explanation);
        }
    }
    void dessertLists() {
        int i = 0;
        menuItems.add(new MenuItem("감자튀김", 4.0, "바삭하고 짭짤한 감자튀김"));
        menuItems.add(new MenuItem("치즈 감자튀김", 4.5, "치즈에 빠진 바삭 짭짤 감자튀김"));
        menuItems.add(new MenuItem("버팔로 윙", 3.0, "오븐에 구운듯한 닭날개"));
        menuItems.add(new MenuItem("세트", 6.9, "감자튀김과 버팔로 윙을 한번에!"));

        for (MenuItem food : menuItems) {
            i++;
            System.out.println(i+". "+food.name + " | W " + food.price + " | " + food.explanation);
        }
        menuItems.clear();
    }
}
