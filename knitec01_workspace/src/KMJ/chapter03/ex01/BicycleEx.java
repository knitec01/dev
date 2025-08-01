package KMJ.chapter03.ex01;

public class BicycleEx {
    public static void main(String[] args) {
        // 매개변수가 있는 생성자만을 선언했으므로 기본 생성자는 자동으로
        // 생성되지 않음에 주의.
        // Bike bike = new Bike();

        Bike bike = new Bike("홍길동");

        bike.run();
        bike.humanpower();
        bike.stop();
    }
}
