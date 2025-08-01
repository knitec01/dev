package KMJ.chapter02.ex13;

public class Car {
    public String model;
    public String color;

    public Car() {
        System.out.println("Car 생성자 호출");
    }

    public void bell(){
        System.out.println("벨이 울립니다.");
    }

    public void sendCargo(String message){
        System.out.println("물건을 발송합니다.: " + message);
    }

    public void receiveCargo(String message){
        System.out.println("물건을 수령합니다.: " + message);
    }

    public void drive(){
        System.out.println("운전을 시작합니다.");
    }
}
