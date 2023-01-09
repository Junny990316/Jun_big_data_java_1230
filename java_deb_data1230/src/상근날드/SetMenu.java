package 상근날드;

import java.util.Arrays;
import java.util.Scanner;

// 상근날드 가게에서는 세트 메뉴를 판매 합니다.
// 햄버거는 3가지 종류가 있고
// 음료는 2가지 종류가 있음
// 입력은 총 5개의 값은 연속으로 입력 하는데 햄버거 3가지 가격, 음료 2가지 가격을 연속으로 입력
// 햄버거 3가지 중 가장 싼 메뉴 선택, 음료 2중 싼 것 선택 하고, 세트 메뉴이기 때문에 50원 할인
// 총 세트 메뉴의 금액 구하는 문제
public class SetMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] menu = new int[5]; // 5개의 정수로 구성된 배열 생성
        System.out.print("메뉴 입력 : "); // 화면 출력
        for (int i = 0; i < menu.length; i++) {
            menu[i] = sc.nextInt(); // 배열의 길이 만큼 순회하면서 값을 연속으로 입력 받음
        }
        int minBurger = menu[0]; // 0~ 2 인덱스 사이의 햄버거 중 하나의 값을 기본값으로 설정
        int minDrink = menu[3]; // 3 ~ 4 인덱스 사이의 음료 중 하나의 값을 기본 값으로 설정
        // 반복문을 순회하면서 햄버거 1개와 음료 1개 선택(제일 싼 것)
        for (int i = 0; i < menu.length; i++) {
            if ((i < 3) && (minBurger > menu[i])) minBurger = menu[i];
            if ((i > 2) && (minDrink > menu[i])) minDrink = menu[i];
        }
        System.out.println(minBurger + minDrink - 50);





       /* Scanner sc = new Scanner(System.in);
        System.out.println("메뉴의 가격을 입력하세요 : ");
        int[] burgers = new int [3];
        int[] drinks = new int[2];

        for(int i = 0; i < burgers.length; i++) {
            burgers[i] = sc.nextInt();
        }
        for (int i = 0; i < drinks.length; i++){
            drinks[i] = sc.nextInt();
        }
        Arrays.sort(burgers);
        Arrays.sort(drinks);
        System.out.println((burgers[0] + drinks[0]) - 50);*/
    }
}
