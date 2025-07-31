package JYS.chapter02;

public class CarEx {
    public static void main(String[] args) {
        Car car = new Car("람보르기니","레드",100);

        Car car2 = new Car("람보르기니","레드");

        System.out.println("모델명:" + car.model);
        System.out.println("시동여부:" + car.color);
        System.out.println("현재속도:" + car.maxSpeed);
    }
}

