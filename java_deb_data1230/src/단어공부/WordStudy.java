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
        int[] alphabet = new int[26]; // 가장 많이 등작하는 알파벳을 알파벳의 갯수만큼 생성
        int max = 0; // 제일 큰 수 찾기
        char rst = 0; // 결과값으로 출력할 알파벳을 구하기 위한 변수
        System.out.print("단어 입력 : ");
        String word = sc.next();
        for (int i = 0; i < word.length(); i++) { // 입력받은 단어의 길이만큼 순회하면 alphabet 배열에 횟수 누적
            if (word.charAt(i) >= 'a') alphabet[word.charAt(i) - 'a']++;
            else alphabet[word.charAt(i) - 'A']++;
        }
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == max) rst = '?'; // 배열 인덱스 값과 max 값이 같으면 '?'
            else if (alphabet[i] > max) {
                max = alphabet[i]; // 인덱스에 해당하는 배열 값이 더 크면 max 값을 변경
                rst = (char) ('A' + i); // 배열 인덱스에서 'A' 만큼의 값을 증가 시켜서 실제 대문자 ASCII 값을 구함
            }
        }
        System.out.println(rst);
    }
}
