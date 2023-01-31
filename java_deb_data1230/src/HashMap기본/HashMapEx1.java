package HashMap기본;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// HashMap : 키와 값으로 구성되어 있음, 키의 중복 여부 확인은 hashCode()를 통해서 수행 함
// 키의 중복은 허용하지 않음, 값은 중복 가능, 순서를 유지 하지 않음
// 경우에 따라서 hashCode()와 equals() 메소드를 오버라이드해서 사용해야 함.
// HashMap은 성능이 우수하고 멀티스레드 환경을 지원하지 않는다(즉 동기화 기능이 없음)
// HashTable은 HashMap과 내부 구조가 동일하며, 멀티스레드 지원
// Properties 는 HashTable을 상속 받아서 기능을 제약하여 사용 (키와 값이 모두 문자열로만 구성), 정보를 파일에 저장하거나 읽기 위한 용도
public class HashMapEx1 {
    public static void main(String[] args) {
        Map<String, Integer>map = new HashMap<>();
        map.put("우영우", 99);
        map.put("동그라미", 55);
        map.put("최수연", 95);
        map.put("이준호", 80);
        map.put("동그라미", 96); // key가 같이 때문에 값이 나중의 값으로 값이 대체 됨
        System.out.println("total Entry : " + map.size());
        // 객체 찾기
        System.out.println(map.get("동그라미"));

        // map을 순회하는 방법 : 향상된 for 문
        for (String key : map.keySet()) { // 모든 키를 set 객체에 담아서 리턴
            System.out.println(key + "\t" + map.get(key));
        }
        // 반복자로 순회하는 방법(iterator)
        Set<String> keySet = map.keySet();
        Iterator<String > iterator = keySet.iterator();
        while (iterator.hasNext()) { // 키가 존재하는지 확인
            String key = iterator.next(); // 키를 가져옴
            System.out.println(key + "\t" + map.get(key));
        }
        // 객체 삭제
        map.remove("최수연"); // 키로 map.Entry를 제거
        System.out.println("total Entry : " + map.size());

        // 값을 수정하는 메소드
        map.replace("이준호", 91);

        // Map.Entry 전체 삭제
        map.clear();
        System.out.println("total Entry : " + map.size());
    }
}
