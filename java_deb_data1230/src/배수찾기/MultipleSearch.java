package 배수찾기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 정수 n과 수의 목록이 주어졌을 때, 목록이 들어있는 수가 n의 배수인지 아닌지 구하는 프로그램 작성
// 입력 : 첫째줄에 n이 주어짐, 다음 줄에 한줄에 한 개씩 목록에 들어있는 수가 주어짐 (0 ~ 1000)
// 출력 : 목록에 있는 수가 n의 배수인지 아닌지를 구한 후 아래처럼 출력
// 3 -> 주어진 수
// 1
// 7
// 9
// 321
// 777
// 0 -> 반복문에 대한 종료
public class MultipleSearch {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val; // 입력 받는 값
       while (true) {
           val = sc.nextInt(); // 값을 입력 받음
           if (val == 0) break; // 탈출 조건
           list.add(val); // add에 인덱스를 지정하지 않으면 마지막 위치에 저장 됨
       }
       for (Integer v : list) {
           if (v % n == 0) System.out.println(v + "is a multiple of " + n + ".");
           else System.out.println(v + "is NOT a multiple of " + n + ".");
       }
    }
}
