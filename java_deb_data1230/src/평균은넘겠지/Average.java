package 평균은넘겠지;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCnt = sc.nextInt(); // 테스트 케이스에 대한 횟수
        double[] rst = new double[testCnt];
        for (int i = 0; i < rst.length; i++) {
            rst[i] = overRate();
        }
        for (double e : rst) {
            System.out.printf("%.3f%%\n", e);
        }
    }

    // 학생수를 입력 받고 이벽 받은 학생수 만큼의 성적을 입력 받음
    // 평균을 구하기 위해서 먼저 총점을 구하고 이를 나누어 평균을 구함
    // 구해진 평균을 가지고 각각의 입력받은 성적을 비교해 평균을 넘는 학생수를 구함
    // 구해진 학생수를 백분율로 변환해서 반환
        static double overRate() {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt(); // 학생수 입력
            int total = 0; // 총점을 구하기 위한 변수
            int overCnt = 0; // 평균을 넘는 학생 수를 구하는 변수
            int[] score = new int[cnt]; // 학생의 수만큼 성적을 입력 받기 위한 배열 생성
            for (int i = 0; i < score.length; i++) {
                score[i] = sc.nextInt(); // 학생의 수만큼 성적을 입력 받아 배열에 대입
                total += score[i]; // 학생의 수만큼 입력된 성적을 누적해서 총점을 구함
            }
            double average = (double) total / cnt; // 총점을 학생의 수로 나누어 평균을 구함
            for (int e : score) { // e는 배열에 포함되어 있는 각각의 학생 성적
                if (e > average) overCnt++; // 평균을 넘는 학생의 수 구하기
            }
            return (double)overCnt / cnt * 100; // 소수점 이하가 있는 백분율로 반환
    }
}