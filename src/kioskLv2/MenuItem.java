package kioskLv2;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {
    String name;
    int price;
    String explanation;
    List<MenuItem> menuItems = new ArrayList<>();

    MenuItem(String name, int price, String explanation) {
        this.name = name;
        this.price = price;
        this.explanation = explanation;
    }

    MenuItem menu() {
        System.out.println(this.name + ", " + this.price + ", "  + this.explanation);
        return null;
    }
}
