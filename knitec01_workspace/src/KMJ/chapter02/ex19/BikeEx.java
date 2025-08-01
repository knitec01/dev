package KMJ.chapter02.ex19;

public class BikeEx {
    public static void main(String[] args) {
        Bike bike = new Bike();

        bike.tire = new Tire();
        bike.run();

        bike.tire = new StrongTire();
        bike.run();

        bike.tire = new SpeedTire();
        bike.run();

    }
}
