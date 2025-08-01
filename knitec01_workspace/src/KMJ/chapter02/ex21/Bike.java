package KMJ.chapter02.ex21;

public class Bike extends Bicycle {
    Bike(String owner){
        // 받은 매개변수를 가지고 부모 생성자를 호출.
        super(owner);
    }

    void humanpower(){
        System.out.println("직접 밟습니다.");
    }
}
