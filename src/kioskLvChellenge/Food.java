package kioskLvChellenge;


import java.util.List;


public class Food implements ListMain {
    // 속성
    Cart cart;

    // 생성자
    Food (Cart cart) {
        this.cart = cart;
    }

    // 기능
    // 음식 리스트
    public void foodcategory() {
        menuItems.put("burger", List.of(
                new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
                new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
                new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")
        ));
        menuItems.put("drink", List.of(
                new MenuItem("콜라", 2.0, "콜라는 역시 코카콜라!"),
                new MenuItem("사이다", 2.0, "사이다는 역시 칠성!"),
                new MenuItem("제로 콜라", 2.5, "제로 콜라는 역시 펩시!"),
                new MenuItem("제로 사이다", 2.5, "제로 사이다는 역시 칠성!")
        ));
        menuItems.put("dessert", List.of(
                new MenuItem("감자튀김", 4.0, "바삭하고 짭짤한 감자튀김"),
                new MenuItem("치즈 감자튀김", 4.5, "치즈에 빠진 바삭 짭짤 감자튀김"),
                new MenuItem("버팔로 윙", 3.0, "오븐에 구운듯한 닭날개"),
                new MenuItem("세트", 6.9, "감자튀김과 버팔로 윙을 한번에!")
        ));
    }

    // 새로운 출력 메소드
    public void printFood(String category) {
        int i = 0;
        System.out.println("[ MENU ]");
        if (menuItems.containsKey(category)) {
            List<MenuItem> items = menuItems.get(category);
            for (MenuItem item : items) {
                i++;
                System.out.println(i + ". " + item.getName() + " | W " + item.getPrice() + " |  설명 :" + item.getExplanation());
            }
        }
        System.out.println("0. 뒤로가기");
    }

    // 새로운 선택 메소드
    public void selectFood(String category) {
        System.out.print("메뉴를 선택해주세요 : ");
        int num1 = scanner.nextInt();

        int i = 0;
        List<MenuItem> items = menuItems.get(category);
        for (MenuItem item : items) {
            i++;
            if (num1 == i) {
                System.out.println("""
                        
                        [ 선택된 메뉴 ]""");
                System.out.println(i + ". " + item.getName()
                        + " | W " + item.getPrice() + " |  설명 :"
                        + item.getExplanation());
                cart.cartAdd(item.getName(), item.getPrice());
            }
        }
    }
}
