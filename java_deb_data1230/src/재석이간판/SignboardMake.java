package 재석이간판;

import java.util.Arrays;
import java.util.Scanner;

// 각 숫자마다 차지하는 공간이 다르다
// 0 = 4칸, 1 = 2칸, 나머지 수는 3칸을 차지
// 간판의 각 숫자 사이는 한칸의 여백이 필요
// 총 입력한 숫자를 표기하기 위해 몇칸의 공간이 필요한지 계산하는 문제
// 5611 = 1 + 3 + 1 + 3 + 1 + 2 + 1 + 2 + 1 = 15
// 입력은 0이 들어올 때 까지 계속 반복
public class SignboardMake {
    public static void main(String[] args) {
       /* for(;;){
            int cnt=1;*/
        int[] numberSize = {4,2,3,3,3,3,3,3,3,3};
        Scanner sc = new Scanner(System.in);
        String number; // 문자열 입력 받는 변수
        int sum = 0; // 총 몇자리의 공간을 차지하는지 누적하는 변수
        while (true) {
            String number1 = sc.next();
            if (number1.equals("0")) break;
            for (int i = 0; i <number1.length(); i++) {
                sum += numberSize[number1.charAt(i)-'0'] + 1;
            }
            // 전체 공간에서 맨 앞 공간을 위해 1을 더해 줌
            System.out.println(sum + 1);
            sum = 0;
        }
        /*String number = sc.nextLine();
        int  [] num1 = Arrays.stream(number.split("")).mapToInt(Integer::parseInt).toArray();

        for(int i = 0; i<num1.length;i++){
            if(num1[i]==0){
                cnt +=5;
            }else if (num1[i]==1){
                cnt +=3;
            }else cnt +=4;
        }

        if(number.equals("0")){
            break;
        }

        System.out.println(cnt);
        }*/
    }
}
