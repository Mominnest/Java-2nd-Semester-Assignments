public class Car {
    private int year;
    private String model;
    private float price;
    private String color;
    private Engine engine;

    public Car(int year, String model, float price, String color, Engine engine) {
        this.year = year;
        this.model = model;
        this.price = price;
        this.color = color;
        this.engine = engine;
    }

    public void displayInfo() {
        System.out.println("Year: " + year + ", Model: " + model + ", Price: " + price + ", Color: " + color);
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }
}
