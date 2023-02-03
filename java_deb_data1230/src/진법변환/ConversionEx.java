package 진법변환;

import java.util.Scanner;

public class ConversionEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] bin1 = {"000", "001", "010","011", "100","101","110","111"};
        String[] bin2 = {"", "1","10","11","100","110","111"};
        String oct = sc.next();
        for (int i = 0; i < oct.length(); i++) {
            if (oct.length() == 1 && oct.charAt(0) - '0' ==0) {
                System.out.println("0");
                break;
            }
            if (i == 0) {
                System.out.print(bin2[oct.charAt(0) - '0']);
            } else {
                System.out.print(bin1[oct.charAt(0) - '0']);
            }
        }
    }
}
