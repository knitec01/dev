package JYS.chapter02.ex15;

public class SupersonicAirplaneEx {
    public static void main(String[] args) {
        SupersonicAirplane supersonicAirplane = new SupersonicAirplane();

        supersonicAirplane.takeOff();
        supersonicAirplane.fly();
        supersonicAirplane.flyMode = SupersonicAirplane.SUPERSONIC;
        supersonicAirplane.fly();
        supersonicAirplane.flyMode = SupersonicAirplane.NORMAL;
        supersonicAirplane.land();
    }

}
