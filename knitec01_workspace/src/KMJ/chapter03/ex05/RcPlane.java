package KMJ.chapter03.ex05;

public class RcPlane implements RemoteControl{
    // 필드
    private int speed;

    // turnOn() 추상 메소드 오버리이딩
    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    // turnOff() 추상 메소드 오버라이딩
    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    // setVolume() 추상 메소드 오버라이딩
    @Override
    public void setSpeed(int speed) {
        if(speed > RemoteControl.MAX_SPEED) {
            this.speed = RemoteControl.MAX_SPEED;
        }
        else if(speed < RemoteControl.MIN_SPEED) {
            this.speed = RemoteControl.MIN_SPEED;
        }
        else {
            this.speed = speed;
        }
        System.out.println("현재 Audio 볼륨: " + speed);
    }

    // 필드
    // 추가 필드 선언
    private int memorySpeed;

    // 디폴트 메소드 재정의
    public void setStop(boolean stop) {
        if(stop) {
            this.memorySpeed = this.speed;
            System.out.println("속도를 설정합니다..");
        }
        else {
            System.out.println("속도를 설정합니다..");
            // stop이 false일 경우, 원래 속도으로 복원하는 코드
            setSpeed(this.memorySpeed);
        }
    }
}
