package 자동차만들기;

public class VehicleMain {
    public static void main(String[] args) {
        sportCar sportCar = new sportCar("sportCar");
        sportCar.getSpeed();
        sportCar.getTurbo();
        sportCar.setTurbo(true);

        bus bus = new bus("bus");
        bus.getOilTank();
        bus.setOilTank(true);
        bus.getSubOilTank();

        car car = new car("car");
        car.getSeat();
        car.getTrunk();
        car.setTrunk(true);
    }
}
