package KMJ.chapter03.ex07;

public class MultiImplEx {
    public static void main(String[] args) {
        RemoteControl rc = new RcPlane();
        rc.turnOn();
        rc.turnOff();

        Scan scan = new RcPlane();
        scan.scanning("건물");

        // RemoteControl의 메소드 사용 불가.
        // Scan.turnOn();
        // Scan.turnOff();
    }
}
