
class Animal {

    void NumOfLegs() {
        System.out.println("Has 2 legs");
    }

}

class cat extends Animal {

    @Override
    void NumOfLegs() {
        System.out.println("Has 4 Legs");
    }

    void meow() {
        System.out.println("Meow...");
    }

}

class kitten extends cat {

}

public class MultilevelInheritance {
    public static void main(String[] args) {
        kitten k = new kitten();
        k.NumOfLegs();
        k.meow();
    }
}
