package 반복문forEx1;

import java.util.Scanner;

// for 반복문 : for (초기식, 조건식, 증감식) {반복 수행 구간}
public class ForEx1 {
    public static void main(String[] args) {
        for(int i = 1; i <=100; i++) {
            System.out.printf("%4d", i);
            if(i % 10 == 0) System.out.println();
        }

       /* int i = 1;
        while(true) {
            System.out.printf("%4d", i);
            if(i % 10 == 0) {
                System.out.println();
            }
            if (i == 100) break;
            i++;*/

     /*   int i = 1;
        while(i <= 100) {
            System.out.printf("%4d", i);
            if(i % 10 == 0) System.out.println();
           i++;
        }*/
//-------------------------------------------------------------

       /* Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 하세요 : ");
        int number = sc.nextInt();
        int sum = 0;
        while(number > 0) {
            sum += number; // sum = sum + number;
            number--;
        }
        System.out.print("정수의 합은 : " + sum);*/

        /*Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 하세요 : ");
        int number = sc.nextInt();
       int result = recursiveFunc(number);
       System.out.println(result);
    }
    public static int recursiveFunc(int n) { // recursiveFunc 자기 자신을 불러오는 것
        if(n == 1) return 1;
        return n + recursiveFunc(n -1);*/
    }
}
