package 기본프로그램; //접근제한자(캡슐화)와 연관성이 있음
// 접근제한자 : public, protect, default, private
/*
-여기는 범위 주석
-주석이란? 사람은 이해하고 컴파일러는 무시하는 영역
-저자 : 허주은
-Date : 2023.01.02 오전 10:16
-목적 : 자바 연습용 프로그램
 */
public class Sample { // 파일이름과 클래스 이름 같아야함, 클래스 이름은 관례상 첫자를 대문자로 사용
    // main 메소드는 프로그램의 시작 위치를 의미하며 JVM이 호출 함.
    // {} : 중괄호, 클래스, 메소드 등의 범위를 결정
    // () : 소괄호, 메소드의 매개변수를 넣는 곳
    // [] : 대괄호, 배열 등을 정리할 때 사용
    public static void main(String[] args) { // static을 붙이면 한번만 만들어짐 메인에는 static을 붙어야한다.
        // void는 메소드 실행 이후의 반환 타입 중 하나
        System.out.println("Hello, Java!!" );
    }
}
