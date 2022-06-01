package ovning13;

public class Main {
    public static void main(String[] args) {
        Owner ow = new Owner("Anders", "Stockhlom");
        System.out.println(ow.toString());
        Car car = new Car("ABC123", "Volvo");
        ow.setCar(car);
        System.out.println(ow.toString());
        ow.removeCar();
        System.out.println(ow.toString());
// this would be a syn
    }
}
