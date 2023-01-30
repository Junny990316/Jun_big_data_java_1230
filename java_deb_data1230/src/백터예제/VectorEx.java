package 백터예제;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

// Vector는 ArrayList와 내부적으로 동일한 구조 입니다. 메소드의 사용 방법도 완전히 통일 합니다.
// 멀티스레드에 안전 합니다. 단, 성능은 떨어짐
public class VectorEx {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>();
        list.add(new NameCard("123456789", "jun","heojueun@gmail",
                "student", "Seoul"));
        list.add(new NameCard("123456789", "junny","jueun@gmail",
                "unemployed", "Incheon"));
        list.add(new NameCard("987654321", "동그라미","ddd@gmail",
                "unemployed", "강원도"));

        for (NameCard e : list) {
            System.out.println("이름 : " + e.name);
            System.out.println("전화번호 : " + e.phone);
            System.out.println("이메일 : " + e.mail);
            System.out.println("직급 : " + e.position);
            System.out.println("주소 : " + e.address);
        }
    }
}
class NameCard {
    String phone;
    String name;
    String mail;
    String position;
    String address;

    public NameCard(String phone, String name, String mail, String position, String address) {
        this.phone = phone;
        this.name = name;
        this.mail = mail;
        this.position = position;
        this.address = address;
    }
}