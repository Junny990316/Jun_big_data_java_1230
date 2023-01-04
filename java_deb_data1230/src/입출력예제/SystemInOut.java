package 입출력예제;

import java.util.Scanner;

public class SystemInOut {
    public static void main(String[] args) {
        String name = "주은";
        String addr = "경기도 수원시";
        char gender = 'W';
        int age = 30;
        int kor = 99;
        int eng = 88;
        int mat = 55;
        // 자바 스타일 (메소드를 오버로딩 하는 방식)
        System.out.println("===========Java Style Output===========");
        System.out.println("Name : " + name + "\n");
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : "+ age);
        System.out.println("총점 : " + (kor + eng + mat));
        System.out.println("평균 : " + ((double)(kor + eng + mat)/3));
        // C언어 스타일 (서식지정자를 사용)
        // 서식지정자 : %d, %ld, %u, %f, %.2f, %s, %c, %%, %b
        // 이스케이프시퀀시 : \n(줄바꿈), \r(캐리지리턴(CR)), \t(탭), \b, \\
        System.out.printf("===========Java Style Output===========\n");
        System.out.printf("이름 : %s, 주소 : %s\n", name, addr);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("총점 : %d\n", kor + eng + mat);
        System.out.printf("평균 : %.2f\n", + (double)(kor + eng + mat)/3);

        System.out.print("Apple\tBanana\tKiwi\n");

        System.out.println("\"Enter\" 키를 입력하시면 종료 됩니다.");
        System.out.println("Hello\\Java");
        System.out.printf("오늘의 습도는 %d%%\n", 25);

        System.out.printf("===========Java Style Output===========\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n * n; i++){
            System.out.printf("%4d ", i);
            if(i % n == 0) System.out.println();
        }
    }
}
