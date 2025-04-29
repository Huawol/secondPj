package kioskLvChellenge;

import java.util.*;

public interface ListMain {
    //List<MenuItem> menuItems11 = new ArrayList<>(); //
    Map<String, Double> cartItems = new HashMap<>(); // cart클래스에서 사용중
    Scanner scanner = new Scanner(System.in);
    Map<String, List<MenuItem>> menuItems = new HashMap<>();
    Map<String, Integer> countDuplication = new HashMap<>();
}
