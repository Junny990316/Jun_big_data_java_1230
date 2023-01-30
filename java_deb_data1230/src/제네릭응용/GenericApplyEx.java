package 제네릭응용;

public class GenericApplyEx {
    public static void main(String[] args) {
        GenericPrint<Powder> powderPrinter = new GenericPrint<>();
        powderPrinter.setMaterial(new Powder()); // Powder 타입의 객체를 생성해서 매개변수로 전달
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powder);

        GenericPrint<Plastic> plasticPrinter = new GenericPrint<>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plastic);

        GenericPrint<Water> waterPrinter = new GenericPrint<>();
        waterPrinter.setMaterial(new Water());
    }
}
