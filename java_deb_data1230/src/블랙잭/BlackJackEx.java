package 블랙잭;
import java.util.Scanner;
public class BlackJackEx {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("카드 장 수 : ");
        int n = sc.nextInt();
        System.out.print("주어진 값 : ");
        int m = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    sum = arr[i] + arr[j] + arr[k];

                    if (sum <= m && result < sum) result = sum;
                }
            }
        }
        System.out.println(result);
    }
}
