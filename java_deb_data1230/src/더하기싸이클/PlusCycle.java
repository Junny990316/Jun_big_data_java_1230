package 더하기싸이클;

import java.util.Scanner;

public class PlusCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumNum = 0;
        int newNum = 0;
        int cnt = 0;
        System.out.print("입력 : ");
        int input = sc.nextInt();
        int num = input;

        while (true) {
            sumNum = (num / 10) + (num % 10);
            newNum = (num % 10) * 10 + (sumNum % 10);
            cnt++;
            if (newNum == input) break;
            num = newNum;
        } System.out.println(cnt); 
    }
}
