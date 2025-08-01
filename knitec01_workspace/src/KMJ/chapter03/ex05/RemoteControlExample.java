package KMJ.chapter03.ex05;

public class RemoteControlExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // 인터페이스 변수 선언
        RemoteControl rc;

        // RcCar 객체를 생성하고 인터페이스 변수에 대입
        // 인터페이스로 RcCar 객체 사용
        // 구현 객체 대입
        rc = new RcCar();
        rc.turnOn();
        rc.setSpeed(20);

        // 디폴트 메소드 호출
        rc.setStop(true);
        rc.setStop(false);

        System.out.println();

        // RcPlane 객체를 생성하고 인터페이스 변수에 대입
        rc = new RcPlane();
        rc.turnOn();
        rc.setSpeed(20);

        // 디폴트 메소드 호출
        rc.setStop(true);
        rc.setStop(false);
    }

}
