package kioskLvChellenge;

public class MenuItem {
    // 음식 정보관련 클래스
    private final String category;
    private final String name;
    private final double price;
    private final String explanation;


    public MenuItem(String category, String name, double price, String explanation) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.explanation = explanation;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }


    public String getExplanation() {
        return explanation;
    }

    public String getCategory() {
        return category;
    }
}
