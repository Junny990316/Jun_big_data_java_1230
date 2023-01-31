package 커피메뉴만들기;

public class MenuInfo implements Comparable<MenuInfo>{
    String name;
    int price; // 가격
    String group;
    String desc;

    public MenuInfo(String name, int price, String group, String desc) {
        this.name = name;
        this.price = price;
        this.group = group;
        this.desc = desc;
    }

    @Override
    public int compareTo(MenuInfo o) {
        return name.compareTo(o.name);
    }
}
