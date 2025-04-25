package kioskLvChellenge.food;

import kioskLvChellenge.ListMain;
import kioskLvChellenge.MenuItem;

public class DessertList implements ListMain {
    private DessertList dessertLists() {
        int i = 0;
        menuItems.add(new MenuItem("감자튀김", 4.0, "바삭하고 짭짤한 감자튀김"));
        menuItems.add(new MenuItem("치즈 감자튀김", 4.5, "치즈에 빠진 바삭 짭짤 감자튀김"));
        menuItems.add(new MenuItem("버팔로 윙", 3.0, "오븐에 구운듯한 닭날개"));
        menuItems.add(new MenuItem("세트", 6.9, "감자튀김과 버팔로 윙을 한번에!"));

        for (MenuItem food : menuItems) {
            i++;
            System.out.println(i + ". " + food.getName() + " | W " + food.getPrice() + " | " + "설명 : " + food.getExplanation());
        }
        System.out.println("0. 뒤로가기");
        return null;
    }
    public DessertList getDessertLists() {
        return dessertLists();
    }
}
