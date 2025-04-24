package kioskLv4;

public class DrinkList implements ListMain{
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
}
