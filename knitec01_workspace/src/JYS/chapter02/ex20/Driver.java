package JYS.chapter02.ex20;

public class Driver {
    public void drive(Vehicle vehicle){
        if(vehicle instanceof  Bus){
            System.out.println("이번에는 버스입니다.");
        }
        vehicle.run();

    }
}
