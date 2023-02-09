package 입출력스트림예제1번;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// 입출력스트림 : 컴퓨터 내부와 외부장치 간에 데이터를 주고 받는 것을 의미하며,
// 입출력 데이터를 공통적인 방법으로 처리하기 위한 스트림을 제공함
// byteStream : 바이트 단위로 데이터를 전송 하는 것, 성능이 우수하고, 파일로 저장 시 결과 확인 불가
// 바이트 스트림의 최상위 추상 클래스는 OutPutStream 이다
public class InPutStreamEx1 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("test.bin");
        byte[] array = {10,20,30,40,50};
        os.write(array, 1, 3); // 배열 1부터 4개를 출력


        os.flush();
        os.close();
    }
}
