package kioskLvChellenge;

public class MenuItem {
    // 음식 정보관련 클래스
    private String name;
    private double price;
    private String explanation;


    MenuItem(String name, double price, String explanation) {
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
}
