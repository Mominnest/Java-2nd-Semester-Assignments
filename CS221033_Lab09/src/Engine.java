public class Engine {
    private String modelNumber;

    public Engine(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public void start() {
        System.out.println("Engine started");
    }

    public void stop() {
        System.out.println("Engine stopped");
    }
}
