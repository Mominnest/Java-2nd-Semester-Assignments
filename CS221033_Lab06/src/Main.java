class Member {
    String name;
    int age;
    String address;
    int phone_number;
    double salary;

    public Member(String name, int age, int phone_number, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;

    public Employee(String name, int age, int phone_number, String address, double salary, String specialization) {
        super(name, age, phone_number, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Member {
    String department;

    public Manager(String name, int age, int phone_number, String address, double salary, String department) {
        super(name, age, phone_number, address, salary);
        this.department = department;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee abc = new Employee("Ali", 29, 984567, "fb area", 70000.00, "Software Developer");
        System.out.println("Employee Details:");
        System.out.println("Name: " + abc.name);
        System.out.println("Age: " + abc.age);
        System.out.println("Phone Number: " + abc.phone_number);
        System.out.println("Address: " + abc.address);
        abc.printSalary();
        System.out.println("Specialization: " + abc.specialization);

        Manager xyz = new Manager("Ilf Ali Momin", 19, 1912003, "fb area", 300000.00, "Data Analyst");
        System.out.println("Manager Details:");
        System.out.println("Name: " + xyz.name);
        System.out.println("Age: " + xyz.age);
        System.out.println("Phone Number: " + xyz.phone_number);
        System.out.println("Address: " + xyz.address);
        xyz.printSalary();
        System.out.println("Department: " + xyz.department);
    }
}
