package kioskLv3;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {
    // 음식 정보관련 클래스
    String name;
    double price;
    String explanation;
    List<MenuItem> menuItems = new ArrayList<>();

    MenuItem(String name, double price, String explanation) {
        this.name = name;
        this.price = price;
        this.explanation = explanation;
    }
}
