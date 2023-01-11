package 최소값최값구하기;

import java.util.Arrays;
import java.util.Scanner;

// 정수 값 이력
// 입력된 정수 범위의 임의의 값 입력해서 배열 생성
// 해당 배열에서 제일 작은 값과 제일 큰 값 찾기
// 정수 값 입력 : 10
// 1 3 5 7 2 4 10 10 20 15
// MIN : 1
// MAX : 20
public class MinMaxArray {
    public static void main(String[] args) {
        // 키보드 입력을 위한 스캐너 생성
        // 정수값 입력 받음
        // 입력 받은 정수로 배열을 생성
        //입력받은 변수의 크기만큼 배열을 생성
        // 생성된 배열 갯수 만큼 순회 하면서 정수값을 입력 받음
        // 배열에서 제일 작은 값과 제일 큰 값을 찾음
        // 출력

        Scanner sc = new Scanner(System.in);
        System.out.println("배열 갯수 입력 : ");
        int arrNum = sc.nextInt();
        int [] arr = new int [arrNum];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
           }
           int min = arr[0];
           int max = arr[0];
           /* for (int e : arr) {
           if (min > e ) min = e;
           if (max < e) max = e;
           }
            */
           for(int i = 0; i < arr.length; i++) {
               if(min > arr[i]) min = arr[i];
               if(max < arr[i]) max = arr[i];

           }
        System.out.println("최소값 : " + min);
           System.out.println("최대값 : " + max);
    }
}
