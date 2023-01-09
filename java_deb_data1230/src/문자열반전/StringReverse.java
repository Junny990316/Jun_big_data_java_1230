package 문자열반전;
import java.util.Scanner;
// abcdefg => gfedcba
// 힌트 : for문을 이용
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자 입력 : ");
        String str = sc.next();

        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

    }
}
