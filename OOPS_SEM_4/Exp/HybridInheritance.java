
class cellPhone {
    void call() {
        System.out.println("Call using Buttons (Manually)");
    }
}

interface camera {
    void clickPic();
}

class SmartPhone extends cellPhone implements camera {

    @Override
    void call() {
        System.out.println("Call USing Voice Assistance");
    }

    @Override
    public void clickPic() {
        System.out.println("Pic Clicked");

    }

}

public class HybridInheritance {
    public static void main(String[] args) {

        SmartPhone s = new SmartPhone();
        s.call();
        s.clickPic();

    }
}
