package KMJ.chapter03.ex05;

public class RcCar implements RemoteControl{
    // 필드
    private int speed;

    // turnOn() 추상 메소드 오버리이딩
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    // turnOff() 추상 메소드 오버라이딩
    @Override
    public void turnOff() {
        System.out.println("TVV를 끕니다.");
    }

    // setVolume() 추상 메소드 오버라이딩
    @Override
    public void setSpeed(int speed) {
        // 인터페이스 상수 필드를 이용해서 volume 필드의 값을 제한
        if(speed > RemoteControl.MAX_SPEED) {
            this.speed = RemoteControl.MAX_SPEED;
        }
        else if(speed < RemoteControl.MIN_SPEED){
            this.speed = RemoteControl.MIN_SPEED;
        }
        else {
            this.speed = speed;
        }
    }
}