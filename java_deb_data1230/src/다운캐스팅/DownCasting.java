package 다운캐스팅;

import java.util.ArrayList;

// 다운캐스팅? 상위 클래스형으로 변환 되었던 하위클래스를 다시 원래 자료형으로 변환하는 것을 다운캐스팅
// instanceof : 형 변환 가능 여부를 확인하는 것 (참조 변수가 참조하고 있는 객체의 실제 타입을 알아보기 위해 사용)
public class DownCasting {
    ArrayList<Animal> aniList = new ArrayList<>();
    public static void main(String[] args) {
        DownCasting downCasting = new DownCasting();
        downCasting.addAnimal();
    }
    public void addAnimal() {
        aniList.add(new human()); // Animal type에 대한 객체가 추가 됨, ArrayList에 추가되면서 타입이 Animal 형으로 변환
        aniList.add(new Tiger());
        aniList.add(new Eagle());
        for (Animal e : aniList) e.move();
    }
    public void testCasting() {
        for (int i = 0; i < aniList.size(); i++) {
            Animal ani = aniList.get(i); // List의 해당 인덱스의 값을 가져 옴
            if (ani instanceof human) { // human type으로 형 변환 가능 여부를 묻는 것
                human h = (human) ani;
                h.readBook();
            } else if (ani instanceof Tiger) {
                Tiger t = (Tiger) ani;
                t.hunting();
            } else if (ani instanceof Eagle) {
                Eagle e = (Eagle) ani;
                e.flying();
            } else {
                System.out.println("지원 되지 않는 형 입니다.");
            }
        }
    }
}
