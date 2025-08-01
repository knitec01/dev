package KMJ.chapter03.ex01;

public class Bike extends Bicycle {
    public Bike(String owner) {
        super(owner);
    }

    void humanpower(){
        System.out.println("직접 밟습니다.");
    }
}
