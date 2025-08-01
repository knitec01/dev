package KMJ.chapter02.ex13;

// 상속: 부모 클래스의 필드와 메소드를 재 사용할 수 있다.
public class TruckEx {
    public static void main(String[] args) {
        // Car, Truck객체가 2개 생성됨.
        // 매개변수가 2개인 Truck의 생성자를 호출
        // 1. Truck의 생성자 호출
        // 2. Car 생성자 호출
        Truck myTruck = new Truck("포터", "용달블루");

        System.out.println("모델: " + myTruck.model);
        System.out.println("색상: " + myTruck.color);

        myTruck.load();

        myTruck.bell();
        myTruck.sendCargo("냉장고");
        myTruck.drive();
        myTruck.receiveCargo("전자레인지");
        myTruck.drive();
        myTruck.sendCargo("세탁기");
        myTruck.drive();

        myTruck.setCapacity(true);
        myTruck.load();

    }
}
