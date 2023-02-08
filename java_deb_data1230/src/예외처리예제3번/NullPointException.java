package 예외처리예제3번;
// NullPointException : 참조하고 있는 주소를 접근했을 때 값이 없는 경우
public class NullPointException {
    public static void main(String[] args) {
        Test test = null;
        try {
            String testStr = test.name;
            System.out.println(test);
        } catch (NullPointerException e) {
            System.out.println("참조하고 있는 곳에 값이 없습니다.");
        }

    }
}
class Test {
    String name = "junny";
}
