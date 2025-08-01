package KMJ.chapter02.ex13;

// Car(부모 클래스)을 상속받은 Truck(자식 클래스)
public class Truck extends Car{
    public boolean capacity;

    //
    public Truck(String model, String color){
        // Phone의 생성자를 호출하는 코드.
        // super();
        System.out.println("SmartPhone 생성자 호출");
        this.model = model;
        this.color = color;
    }

    public void setCapacity(boolean capacity){
        this.capacity = capacity;
        System.out.println("최대 적재량을 설정했습니다.");
    }

    public void load(){
        System.out.println("화물을 적재합니다.");
    }
}
