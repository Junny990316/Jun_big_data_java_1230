package 손익분기점;

import java.util.Scanner;

public class Laptop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 고정비용
        int b = sc.nextInt(); // 가변 비용
        int c = sc.nextInt(); // 노트북 가격
        if (b >= c) {
            System.out.print("-1");
        }else {
            System.out.print(a/(c-b) +1);
        }
    }
}
