class Bank {
    int getBalance() {
        return 0;
    }
}
class BankA extends Bank {
    int getBalance() {
        return 1000;
    }
}
class BankB extends Bank {
    int getBalance() {
        return 1500;
    }
}

class BankC extends Bank {
    int getBalance() {
        return 2000;
    }
}
public class P2 {
    public static void main(String[] args) {
        BankA obj1 = new BankA();
        BankB obj2 = new BankB();
        BankC obj3 = new BankC();
        System.out.println("Money deposited in Bank A: " + obj1.getBalance());
        System.out.println("Money deposited in Bank B: " + obj2.getBalance());
        System.out.println("Money deposited in Bank C: " + obj3.getBalance());
    }
}
