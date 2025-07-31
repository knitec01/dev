package JYS.chapter03.ex01;

// 상속을 해주는 클래스
public abstract class Phone {
    String owner;

    public Phone(String owner){
        this.owner = owner;
    }

    void turnOn(){
        System.out.println("폰 전원을 켭니다.");
    }

    void turnOff(){
        System.out.println("폰 전원을 끕니다.");
    }

}
