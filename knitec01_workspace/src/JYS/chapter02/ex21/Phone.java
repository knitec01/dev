package JYS.chapter02.ex21;

public class Phone {
    String owner;

    //매개변수가 1개인 생성자
    Phone(String owner){
        // Phone 클래스의 필드 owner
        this.owner = owner;
    }

    void turnOn(){
        System.out.println("폰 전원을 켭니다.");
    }

    void turnOff(){
        System.out.println("폰 전원을 끕니다.");
    }

}
