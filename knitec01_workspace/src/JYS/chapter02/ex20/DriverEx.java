package JYS.chapter02.ex20;

import JYS.chapter02.ex16.example02.D;
import JYS.chapter02.ex19.HankookTire;

public class DriverEx {
    public static void main(String[] args) {

        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        driver.drive(bus);
        driver.drive(taxi);

    }
}
