package 클래스정렬연습문제;
// 학생의 수 입력 받기
// 학생의 수 만큼의 객체 생성하여 정보를 입력 (이름,성적,학번)
// 학생의 성적이 높은 순으로 결과를 표시하고 성적이 같으면 학번순으로 정렬
// 그리고 출력시 등수가 표기되도록 할 것
// [입력예시]
// 학생 수 입력 : 3
// 안유진 99 202301
// 정국 87 202302
// 채연 88 202303

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

// [출력예시]
// ==== 학생 성적 출력 ====
//-----------------------
// 석차 성적 이름 학번
// ----------------------
// 1 99 안유진 202301
// 2 97
public class ClassSortEx1 {
    public static void main(String[] args) {
        TreeSet<StudentInfo> ts = new TreeSet<>((Comparator) new ClassSort());
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수 입력 : ");
        int n = sc.nextInt();
        int cnt = 0;
        int preScore = 0;
        for (int i = 0; i < n; i++) {
            ts.add(new StudentInfo(sc.next(), sc.nextInt(), sc.nextLine()));
        }
        System.out.println("==== 학생 성적 출력 ====");
        System.out.println("----------------------");
        System.out.println("석차   성적   이름   학번");
        System.out.println("----------------------");
        for (StudentInfo e : ts) {
            if (preScore != e.score) cnt++;
            System.out.printf("%2d%6d%5s%5s\n", cnt, e.score, e.name, e.studentNum);
            preScore = e.score; // 현재 점수를 변수에 저장
        }
        System.out.println("----------------------");
    }
}
