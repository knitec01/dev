package KMJ.chapter03.ex04;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new RcCar();
        rc.turnOn();

        // rc 변수에 RcPlane 객체를 대입(교체)
        rc = new RcPlane();
        rc.turnOn();

    }
}
