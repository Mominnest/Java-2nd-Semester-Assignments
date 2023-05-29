public class Main1{
    public static void main(String[] args) {
        Engine engine = new Engine("12458");
        Car car = new Car(2017, "Toyota vitz", 2900000.0f, "White", engine);
        car.start();
        car.displayInfo();
        car.stop();
    }
}