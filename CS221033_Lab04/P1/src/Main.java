import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private double[] numbers;
    private double average;
    private double mean;
    private double median;
    private double mode;

    public Main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter at least 10 numbers separated by space: ");
        String[] input = scanner.nextLine().split(" ");
        while (input.length < 10) {
            System.out.print("Please enter at least 10 numbers: ");
            input = scanner.nextLine().split(" ");
        }
        this.numbers = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Double.parseDouble(input[i]);
        }
        Arrays.sort(numbers);
        calculateAverage();
        calculateMean();
        calculateMedian();
        calculateMode();
    }

    public void calculateAverage() {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        average = sum / numbers.length;
    }

    public void calculateMean() {
        int mid = numbers.length / 2;
        if (numbers.length % 2 == 0) {
            mean = (numbers[mid - 1] + numbers[mid]) / 2;
        } else {
            mean = numbers[mid];
        }
    }

    public void calculateMedian() {
        int mid = numbers.length / 2;
        if (numbers.length % 2 == 0) {
            median = (numbers[mid - 1] + numbers[mid]) / 2;
        } else {
            median = numbers[mid];
        }
    }

    public void calculateMode() {
        HashMap<Double, Integer> numberCounts = new HashMap<>();
        for (double number : numbers) {
            if (numberCounts.containsKey(number)) {
                numberCounts.put(number, numberCounts.get(number) + 1);
            } else {
                numberCounts.put(number, 1);
            }
        }
        int maxCount = 0;
        for (int count : numberCounts.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }
        for (double number : numberCounts.keySet()) {
            if (numberCounts.get(number) == maxCount) {
                mode = number;
                break;
            }
        }
    }

    public void printResults() {
        System.out.println("Average: " + average);
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
    }

    public static void main(String[] args) {
        Main analyzer = new Main();
        analyzer.printResults();
    }
}