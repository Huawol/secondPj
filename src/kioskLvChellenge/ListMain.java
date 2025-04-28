package kioskLvChellenge;

import java.util.*;

public interface ListMain {
    List<MenuItem> menuItems = new ArrayList<>(); //
    Map<String, Double> cartItems = new HashMap<>(); // cart클래스에서 사용중
    Map<String, Integer> map = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
}
