package KMJ.chapter02.ex20;

public class DriverEx {
    public static void main(String[] args) {

        // Ctrl + Alt + V: 대입 변수 자동 생성
        Driver driver = new Driver();

        Bike bike = new Bike();

        Motorcycle motorcycle = new Motorcycle();

        driver.drive(bike);

        driver.drive(motorcycle);
    }
}
