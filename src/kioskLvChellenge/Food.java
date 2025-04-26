package kioskLvChellenge;

public class Food implements ListMain { // 음식의 객체를 담을 리스트

    Cart cart = new Cart();
    void burger() {
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    public void dessert() {
        menuItems.add(new MenuItem("감자튀김", 4.0, "바삭하고 짭짤한 감자튀김"));
        menuItems.add(new MenuItem("치즈 감자튀김", 4.5, "치즈에 빠진 바삭 짭짤 감자튀김"));
        menuItems.add(new MenuItem("버팔로 윙", 3.0, "오븐에 구운듯한 닭날개"));
        menuItems.add(new MenuItem("세트", 6.9, "감자튀김과 버팔로 윙을 한번에!"));
    }

    public void drink() {
        menuItems.add(new MenuItem("콜라", 2.0, "콜라는 역시 코카콜라!"));
        menuItems.add(new MenuItem("사이다", 2.0, "사이다는 역시 칠성!"));
        menuItems.add(new MenuItem("제로 콜라", 2.5, "제로 콜라는 역시 펩시!"));
        menuItems.add(new MenuItem("제로 사이다", 2.5, "제로 사이다는 역시 칠성!"));
    }


    // 출력문
    public void printFood() {
        int i = 0;

        for (MenuItem food : menuItems) {
            i++;
            System.out.println(i + ". " + food.getName() + " | W " + food.getPrice() + " | " + "설명 : " + food.getExplanation());
        }
        System.out.println("0. 뒤로가기");
    }

    public void selectFood() {
        int i = 0, num1 = 0;

        System.out.print("메뉴를 선택해주세요 : ");
        num1 = scanner.nextInt();
        for (int j = 0; j <= menuItems.size(); j++) {
            i++;
            if (num1 == i) {
                System.out.println("""
                        
                        [ 선택된 메뉴 ]""");

                System.out.println(i + ". " + menuItems.get(j).getName()
                        + " | W " + menuItems.get(j).getPrice() + " | "
                        + "설명 : " + menuItems.get(j).getExplanation());
            }
        }

        cartItems.put(menuItems.get(num1).getName(),menuItems.get(num1).getPrice()); // cartItems에 menuItems리스트를 .get(j)해서 j번째꺼를 가져온 다음에 추가함
        cart.cartLists(); // cart 클래스에 메뉴 저장하는 메소드
        cart.totalPay();
    }

}
