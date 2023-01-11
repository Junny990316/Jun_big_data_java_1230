package 배열로로또번호생성;

import java.lang.reflect.Array;
import java.util.Arrays;

// 1~ 45 사이의 임의의 수 6개로 구성
// 1. 배열로 로또 번호를 생성해 출력하기
// 2. 배열로 로또 번호를 생성(중복제거)
// 3. 다른 자료구조를 사용해 로또 번호 만들기(ArrayList, Set)
public class RandomLotto {
    public static void main(String[] args) {
        // 정수형 배열 생성, 갯수는 6개(로또 번호 저장을 위한 공간)
        int[] lotto = new int[6];

        int tmp; // 생성된 로또 번호를 배열에 넣기 전에 임시로 저장
        boolean isExist = false; // 번호의 중복 여부 확인
        int index = 0;
        while (true) {
            tmp = (int) ((Math.random() * 45) + 1);
            // 중복 확인 구간
            int i;
            for (i = 0; i < lotto.length; i++) {
                if (lotto[i] == tmp) isExist = true; // 배열에 생성된 로또 번호가 있으면 true
            }
            // 생성된 번호가 배열내에 없으면 저장하는데, index 계산 해줘야함
            if (isExist == false) lotto[index++] = tmp;
            //로또번호가 5개 만들어 졌으면 반복문 탈출
            if (index == lotto.length) break;
            // 존재 여부 확인하는 변수를 초기화 시킴
            isExist = false;
        }
        System.out.print(Arrays.toString(lotto));


        /*int[] lotto = new int[6];
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int)((Math.random()*45) + 1);
        }
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + ", ");
        }
        System.out.print("\b\b");*/

    }

}
