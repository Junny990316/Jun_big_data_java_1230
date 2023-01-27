package 제네릭연습;

import java.time.Instant;
import java.time.Period;

// 제네릭 타입 : 타입 변수를 사용해 다형성 구현
public class GenericTestEx2 {
    public static void main(String[] args) {
        Person<String> p1 = new Person<>("junny");
        System.out.println(p1.info);

        Person<Integer> p2 = new Person<>(1004);
        System.out.println(p2.info);
    }
}
// 'T' 타입 변수라고 하며, 임의의 참조형 타입을 의미, 'T'는 변수명을 의미하며 아무런 이름으로 지을 수 있음(일반적으로 대문자 'T' 사용)
class Person <T> {
    public T info;
    Person(T info) {
        this.info = info;
    }
}