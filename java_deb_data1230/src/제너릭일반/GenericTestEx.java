package 제너릭일반;

import java.util.ArrayList;
import java.util.List;

// 컴파일 시 강한 타입 체크
// 타입 변환 제거
public class GenericTestEx {
    public static void main(String[] args) {
//        List list = new ArrayList(); // java8 이전 스타일
//        list.add("Hello");
//        String str = (String) list.get(0);

        // 제네틱 타입
        // List에서 사용할 데이터 타입을 미리 지정함으로 컴파일 시 타입 체크가 일어나도록 함
        List<String> list = new ArrayList<>();
        list.add("Hello");
        String str = list.get(0); // 0번째 값을 읽어 옴
        System.out.println(str);
    }
}
