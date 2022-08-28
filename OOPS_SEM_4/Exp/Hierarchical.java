
class Animal {
    void NumOfLegs() {
        System.out.println("Has 2 legs");
    }
}

class Dog extends Animal {
    @Override
    void NumOfLegs() {
        System.out.println("Has 4 legs");
    }
}

class Parrot extends Animal {
    @Override
    void NumOfLegs() {
        super.NumOfLegs();
    }
}

class Fish extends Animal {
    @Override
    void NumOfLegs() {
        System.out.println("Has no legs");
    }
}

class Hierarchical {
    public static void main(String[] args) {
        Dog d = new Dog();
        Parrot p = new Parrot();
        Fish f = new Fish();
        d.NumOfLegs();
        p.NumOfLegs();
        f.NumOfLegs();
    }
}