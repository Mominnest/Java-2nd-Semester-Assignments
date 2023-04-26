import java.time.LocalTime;

public class Time {
    private int hour;
    private int minute;
    private int second;

    // Constructor to set the time to the current time
    public Time() {
        LocalTime currentTime = LocalTime.now();
        this.hour = currentTime.getHour();
        this.minute = currentTime.getMinute();
        this.second = currentTime.getSecond();
    }

    // Constructor to set the time to a specific value
    public void Time(int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    // Getters and Setters
    public int getHour() {
        return hour;
    }

    public void setHour(int h) {
        this.hour = h;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int m) {
        this.minute = m;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int s) {
        this.second = s;
    }

    // Other Methods
    public void setTime(int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    public void print() {
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }
    public static void main(String[] args) {
        System.out.println("------------------------------------- ");
        System.out.println("here is the current time ");
        Time t = new Time();
        t.print();
        System.out.println("------------------------------------- ");

    }
}
