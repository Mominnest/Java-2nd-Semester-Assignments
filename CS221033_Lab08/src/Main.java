interface Animal {
    void eat();
    void travel();
}
class Reptiles implements Animal {
    @Override
    public void eat() {
        System.out.println("Reptiles eat insects, small animals, and plants.");
    }

    @Override
    public void travel() {
        System.out.println("Reptiles travel by crawling  on the ground.");
    }
}

class Birds implements Animal {
    @Override
    public void eat() {
        System.out.println("Birds eat seeds, insects, and small animals.");
    }

    @Override
    public void travel() {
        System.out.println("Birds travel by flying in the air.");
    }
}

class Fish implements Animal {
    @Override
    public void eat() {
        System.out.println("Fish eat plant, smaller fish");
    }

    @Override
    public void travel() {
        System.out.println("Fish travel by swimming in the water.");
    }
}

public class Main {
    public static void main(String[] args) {
        Reptiles snake = new Reptiles();
        snake.eat();
        snake.travel();

        Birds eagle = new Birds();
        eagle.eat();
        eagle.travel();

        Fish Dolphin = new Fish();
        Dolphin.eat();
        Dolphin.travel();
    }
}