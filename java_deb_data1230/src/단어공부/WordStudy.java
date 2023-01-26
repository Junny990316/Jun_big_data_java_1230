package 단어공부;

import java.util.Scanner;

// 알파벳 대소문자로 이루어진 단어가 주어지면 가장 많이 등장한 알파벡을 찾는 문제
// 입력은 대소문자를 입력하고, 결과는 대소문자 구분하지 않음
// 만약 가장 많이 등작하는 알파벳이 여러개인 경우는 ?로 출력
// 결과 예시 : AaAbcdd => A
// 결과 예시 : ddcfgrg => ?
public class WordStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String apv = sc.next();
        int sum = 0;
        char[] arr = new char[apv.length()];
        char max = (char) Integer.MIN_VALUE;
        for (int i = 0; i < apv.length(); i++) {
            arr[i] = apv.charAt(i);
            arr[i]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
                sum = i;
            }
        }
        System.out.println("최빈값 : " + sum + ", " + max + "번");
    }
}
