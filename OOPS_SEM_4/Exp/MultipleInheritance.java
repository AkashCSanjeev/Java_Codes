interface camera {
    void clickPic();
}

interface radio {
    void playMusic();
}

class SmartPhone implements camera, radio {

    @Override
    public void clickPic() {
        System.out.println("Picture Clicked");

    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music");

    }

}

public class MultipleInheritance {
    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.clickPic();
        smartPhone.playMusic();

    }
}
