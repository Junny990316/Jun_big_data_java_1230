package 저항;

import java.util.Scanner;

// 전자 제품에는 저항이 들어간다. 처음 색 2개는 값, 마지막 곱해야 하는 값
// 색 : black, brown, red, orange, yellow, green, blue, violet, grey, white
// 값 : 0,1,2,3,4,5,6,7,8,9
// 곱 : 1, 10, 100, 1,000, 10,000, 100,000, 1,000,000, 10,000,000, 100,000,000, 1,000,000,000
// 입력 : yellow violet red
// 결과 : 4,700
// 입력 :
public class ResistanceEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int fstIdx = 0, secIdx = 0, trdIdx = 0;
        String fstColor = sc.next();
        String secColor = sc.next();
        String trdColor = sc.next();
        for (int i = 0; i < color.length; i++){
            if (fstColor.equals(color[i])) fstIdx = i; // 첫번째 입력 받은 컬러 문자열과 배열의 컬러 이름이 같으면 인덱스 대입
            if (secColor.equals(color[i])) secIdx = i;
            if (trdColor.equals(color[i])) trdIdx = i;
        }
        // Math.pow(10, 4) => 2 * 2 * 2 * 2, 제곱함수를 사용해서 풀기
        // 정수 값 범위를 벗어날 수 있으므로 long으로 형변환 해줌
        System.out.println((long)((fstIdx * 10) + secIdx) * (long)(Math.pow(10, trdIdx)));
    }
}
