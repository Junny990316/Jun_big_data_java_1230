package 예외처리예제6번;
import 예외처리예제3번.NullPointException;

import java.io.IOException;
// 에외처리 미루기 : 해당 메소드 내에서 발생한 예외 처리에 대한 책임을 메소드를 호출한 쪽으로 떠넘김
// 예외처리 던지기 :
public class ExceptionEx6 {
    public static void main(String[] args) {
        ThrowEx ex = new ThrowEx();
        ex.printStr(5);

    }
}
class ThrowEx {
    String str = null;
    Integer x = null;
    public void printStr(int cnt) {
        if (str == null) {
            System.out.println("str = null");
            throw new NullPointerException();
        }
        for (int i = 0; i < cnt; i++) {
            System.out.println(str);
        }
    }
}
