package 제네릭응용;

import 클론메소드.Member;

public class Plastic extends Material {
    public void doPrinting() {
        System.out.println("Plastic 재료로 출력 합니다.");
    }
    @Override
    public String toString() {
        return "재료는 Plastic 입니다.";
    }
}
