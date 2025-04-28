package kioskLvChellenge;

public class MenuItem {
    // 음식 정보관련 클래스
    private String food;
    private String name;
    private double price;
    private String explanation;


    public MenuItem(String food,String name, double price, String explanation) {
        this.food =food;
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

    public String getFood() {
        return food;
    }
}
