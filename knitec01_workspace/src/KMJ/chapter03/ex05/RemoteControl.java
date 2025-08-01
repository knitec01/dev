package KMJ.chapter03.ex05;

public interface RemoteControl {
    // 상수 필드
    int MAX_SPEED = 30;
    int MIN_SPEED = 5;

    // 추상 메소드
    // 메소드 선언부만 작성
    // public abstract 생략 됨.
    void turnOn();
    void turnOff();
    void setSpeed(int height);

    // 디폴트 인스턴스 메소드
    default void setStop(boolean stop) {
        if(stop) {
            System.out.println("정지 합니다.");
        }
        else {
            System.out.println("정지 해제합니다.");
            this.setSpeed(MIN_SPEED);
        }
    }

    // 정적 메소드
    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }
}