package 함수형프로그램예제2번;
import java.util.function.IntBinaryOperator;
// 메소드 참조 : 메소드를 참조해서 매개변수의 정보 및 반환타입을 알아 내어, 불필요한 매개변수를 제거함
class Calculator {
    public static int staticMethod(int x, int y) {
        return x + y;
    }
    public int instanceMethod(int x, int y) {
        return x + y;
    }
}
public class FunctionEx2 {
    public static void main(String[] args) {
        IntBinaryOperator operator; // 두개의 int 연산하는 인터페이스
        // 정적 메소드 참조
        operator = (x,y) -> Calculator.staticMethod(x,y);
        System.out.println("result 1 : " + operator.applyAsInt(1, 2)); // 2개의 int 값을 연산

        // 메소드 참조 방식
        operator = Calculator::staticMethod;
        System.out.println("result 2 : " + operator.applyAsInt(3, 4));

        // 인스턴스 메소드 참조
        Calculator obj = new Calculator();
        operator = (x,y) -> obj.instanceMethod(x, y);
        System.out.println("result 3 : " + operator.applyAsInt(5, 6));

        // 메소드 참조 방식
        operator = obj:: instanceMethod; // :: 소속 지정자 : 누구의 소속인지
        System.out.println("result 4 : " + operator.applyAsInt(7, 8));

    }
}
