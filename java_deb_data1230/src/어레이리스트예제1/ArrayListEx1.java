package 어레이리스트예제1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

// List 인터페이스란? 배열과 비슷한 구조를 가지며 하위에 ArrayList, LikedList, Vector 클래스로 구정 됨
// 요소의 저장 순서가 유지, 중복저장을 허용, 공적 할당(크기 지정을 안해도됨), 다양한 메소드 제공
// ArrayList : 물리적으로 연속된 공간에 저장, 검색을 인덱스로 하기 때문에 빠름, 삽입, 삭제는 느림(단, 맨 뒤의 삽입 / 삭제 빠름)
// Vector : ArrayList 와 동일한 특성을 가짐, 단 멀티스레드 환경을 위해 동기화 기능 지원하기 때문에 안정적이나 ArrayList보다 느림
// LinkedList : 물리적으로 연속된 공간이 아님, 참조로 다음 저장 위치를 가리킴. 삽입 / 삭제가 매우 빠름, 검색은 느림
public class ArrayListEx1 {
    public static void main(String[] args) {
        String[] data = {"138", "145", "122", "155", "105"}; // 이미 만들어진 배열
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data)); // asList()는 이미 만들어진 배열을 List에 추가
//        ArrayList<String> pitches = new ArrayList<>(); // List 인터페이스로 ArrayList 객체를 참조 함
//        pitches.add("138"); // ArrayList 마지막에 값 추가 (이때 사이즈가 증가 함)
//        pitches.add("129");
//        pitches.add("138");
//        pitches.add(1, "155"); // 해당 인덱스에 값 추가 (성능에 영향을 미침)
        //pitches.sort(Comparator.naturalOrder()); // 오름차순 정렬
        pitches.sort(Comparator.reverseOrder()); // 내림차순
        System.out.println(pitches);
        //System.out.println(pitches.get(3)); // 전달된 인덱스의 값을 반환함
       // System.out.println(pitches.get(5)); // 없는 인덱스를 전달하면 예외가 발생함.
//        System.out.println(pitches.size()); // ArrayList의 개수 반환
//        System.out.println(pitches.contains("142")); // false 출력 됨, 전달된 값이 ArrayList 내에 있는지 확인
//        System.out.println(pitches.remove(0)); // List에서 해당 학목을 삭제하고 삭제된 요소를 반환함
//        System.out.println(pitches.remove("129")); // List에서 해당 항목을 삭제하고 true/false로 반환
    }
}
