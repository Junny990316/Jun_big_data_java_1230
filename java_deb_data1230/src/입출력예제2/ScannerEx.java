package 입출력예제2;

import java.io.IOException;
import java.util.Scanner; // 두번째로 많이 사용되는 자바 API

//콘솔 입력
//System.in.read() : 키보도의 입력을 ASCII 코드값으로 읽어 들임 - *시험 문제 나올 확률 높음*
//Scanner 입력 : 키보드의 입력을 원하는 데이터 타입으로 반환 받음
public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte(); // 키보드의 입력을 Byte형으로 반환
        short b = sc.nextShort();
        int c = sc.nextInt();
        char ch = sc.next().charAt(0); // 문자열에서 첫번째 문자를 추출
        String s1 = sc.next(); // 문자열을 공백 단위로 입력받음//
        String s2 = sc.next();
}

}