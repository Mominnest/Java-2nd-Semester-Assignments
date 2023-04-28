class Area {
    void printArea(int side) {
        int area = side * side;
        System.out.println("Area of square: " + area);
    }

    void printArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of rectangle: " + area);
    }
}

public class P1 {
    public static void main(String[] args) {
        Area obj = new Area();
        obj.printArea(14);
        obj.printArea(15, 16);
    }
}
