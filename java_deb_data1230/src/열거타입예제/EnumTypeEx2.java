package 열거타입예제;

public class EnumTypeEx2 {
    public static void main(String[] args) {
        Developer developer = new Developer("junny", DevType.BACKEND, Career.JUNIOR, Gender.FEMALE);
        developer.devInfo();
        System.out.println();

        Developer developer1 = new Developer("jun", DevType.FRONTEND, Career.JUNIOR, Gender.FEMALE);
        developer.devInfo();
    }
}
