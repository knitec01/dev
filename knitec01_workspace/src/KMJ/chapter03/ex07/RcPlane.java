package KMJ.chapter03.ex07;

// 다중 구현
public class RcPlane implements RemoteControl, Scan {
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void scanning(String target) {
        System.out.println(target + "을 스캔합니다.");
    }
}
