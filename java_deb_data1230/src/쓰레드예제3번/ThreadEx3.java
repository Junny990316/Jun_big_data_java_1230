package 쓰레드예제3번;
import java.awt.*;
import java.nio.channels.ScatteringByteChannel;

import static java.lang.Thread.sleep;

// sleep() : 실행중인 쓰레드를 일정 시간동안 대기 상태로 만듬
// (반복 수행에 대한 시간을 늦출 때 사용하거나, 인터럽트 예외처리를 위해 사용)
public class ThreadEx3 {
    public static void main(String[] args)  {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 10; i++) {
            toolkit.beep(); // beep 소리 나게 하는 것
            try {
                sleep(3000);
            } catch (InterruptedException e) {
            }

        }
    }
}
