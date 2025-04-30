package kioskLvChellenge;

import java.util.*;

public interface ListMain {
    Map<String, Double> cartItems = new HashMap<>(); // cart클래스에서 사용중
    Map<String, List<MenuItem>> menuItems = new HashMap<>(); // 메뉴 담은 컬렉션
    Map<String, Integer> countDuplication = new HashMap<>(); // 중복으로 들어간 음식 세주기 위해만든 컬랙션
    Scanner scanner = new Scanner(System.in);
}
