package 숫자의합;

import java.util.Scanner;

public class NumberSumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;
        while (true) {
            int sum = 0;
            System.out.print("숫자 입력 : ");
            num = sc.next();
            if (num.equals("0000")) break;
            for (int i = 0; i < num.length(); i++) {
                sum += num.charAt(i) - '0';
            }
            System.out.println("출력 : " + sum);
        }
    }
}
