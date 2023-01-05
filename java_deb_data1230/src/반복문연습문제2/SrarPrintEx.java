package 반복문연습문제2;

import java.util.Scanner;

// 입력 : 5
//*
//* *
//* * *
//* * * *
public class SrarPrintEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("별 갯수 : ");
        int star = sc.nextInt();
        for (int i = 0; i < star; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
