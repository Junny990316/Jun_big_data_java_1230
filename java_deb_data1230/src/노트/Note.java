package 노트;

import java.util.Scanner;

public class Note {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill = sc.nextDouble();
        System.out.print(bill * 15 / 100);
    }
}
