package KMJ.chapter02.ex20;

public class Driver {
    public void drive(Bicycle bicycle){
        if(bicycle instanceof Bike){
            System.out.println("이번에는 버스입니다.");
        }
        bicycle.run();
    }
}
