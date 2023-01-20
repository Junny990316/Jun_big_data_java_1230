package 자동차만들기;

public abstract class VehicleClass {
    protected int speed; // 속도
    protected int fuel; // 연비
    protected int oilTank; // 연료탱크
    protected int seatRoom; // 좌석수
    String name; // 자동차 이름
    boolean isFunction;
    int oilPrice = 2000;
    int oil ;
    VehicleClass(String name) {
        this.name = name;
    }
    void getInfo(int lc, int num) {
        System.out.println(lc / fuel * oilPrice * num + "원"); // 총 이동 비용
        System.out.println(lc / oil * num + "번"); // 총 주유횟수
        System.out.println((double) lc / speed + "시간"); // 총 소요시간
    }
}
class sportCar extends VehicleClass {
    sportCar(String name) {
        super(name);
        fuel = 8;
        speed = 250;
        oilTank = 30;
        seatRoom = 2;
        isFunction = false;
    }
   int getSpeed() {
        if (isFunction) return speed *= 1.2;
        return speed;
   }
    boolean getTurbo() { // 게터
        return isFunction;
    }
    void setTurbo(boolean turbo) {
        isFunction = turbo;
    }
}
class car extends VehicleClass{
    car(String name) {
        super(name);
        fuel = 12;
        speed = 200;
        oilTank = 45;
        seatRoom = 4;
        isFunction = false;
    }
    int getSeat() {
        if (isFunction) return seatRoom += 1;
        return seatRoom;
    }
    boolean getTrunk() {
        return isFunction;
    }
    void setTrunk(boolean trunk) {
        isFunction = trunk;
    }
    void gasStation() {
        gasStation();
    }
}
class bus extends VehicleClass{
    bus(String name) {
        super(name);
        fuel = 5;
        speed = 150;
        oilTank = 100;
        seatRoom = 20;
        isFunction = false;
    }
    int getSubOilTank() {
        if (isFunction) return oilTank += 30;
        return oilTank;
    }
    boolean getOilTank() {
        return isFunction;
    }
    void setOilTank(boolean OilTank) {
        isFunction = OilTank;
    }
}
