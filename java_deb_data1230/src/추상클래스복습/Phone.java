package 추상클래스복습;

import 반복문연습문제2.SrarPrintEx;

public abstract class Phone {
    public String name;
    public boolean isPower;
    public Phone(String name) {
        this.name = name;
    }
    public void setPower(boolean isPower) {
        this.isPower = isPower;
        if(isPower) {
            System.out.println(("Phone Power ON"));
        } else {
            System.out.println("Phone power OFF");
        }
    }
    abstract void call(); // 추상클래스이므로 구현부가 없음
    // 추상메소드는 구현부가 있으면 안됨 {} 중괄호가 있으면 구현부다
}
