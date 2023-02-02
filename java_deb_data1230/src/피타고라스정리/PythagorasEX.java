package 피타고라스정리;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class PythagorasEX {
    public static void main(String[] args) {
        int[] arr = new int[3]; // 3변의 길이를 입력 받기 위한 배열
        Scanner sc = new Scanner(System.in);
        while (true){ // 0 0 0 이 들어올 때 까지 반복
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            if (sum == 0) break;
            Arrays.sort(arr); // 오름차순 정렬
            if ((arr[2] * arr[2]) == (arr[0] * arr[0]) + (arr[1] * arr[1])) {
                System.out.println("right");
            } else System.out.println("wrong");
        }
    }
}
