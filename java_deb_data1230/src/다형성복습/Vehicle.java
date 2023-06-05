package 다형성복습;

public class Vehicle {
    public void run() {
        System.out.println("차량이 달립니다.");
    }
}

class Bus extends Vehicle {
    @Override // 문법적으로 run()이라는 메소드가 오버라이딩 되었는지 확인하기 위해서 사용
    // 부모가 가진 모든 특성이 같아야 한다
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}

class Taxi extends Vehicle {
    @Override
    public void run() {
        System.out.println("택시가 달립니다");
    }
}

class SportsCar extends Vehicle {
    @Override
    public void run() {
        System.out.println("스포트카가 달립니다");
    }
}