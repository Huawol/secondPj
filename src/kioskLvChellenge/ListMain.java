package kioskLvChellenge;

import java.util.*;

public interface ListMain {
    List<MenuItem> menuItems = new ArrayList<>(); //
    Map<String, Double> cartItems = new HashMap<>(); // cart클래스에서 사용중
    Scanner scanner = new Scanner(System.in);
}
