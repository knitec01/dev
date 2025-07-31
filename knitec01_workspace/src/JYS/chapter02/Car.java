package JYS.chapter02;

public class Car {
    String model;
    String color;
    int maxSpeed;

    //생성자 오버로딩(매개변수의 타입정보, 개수)
    Car(String model, String color){
        this(model, "은색",60);
    }

   Car(String model, String color, int maxSpeed){
       this.model = model;
       this.color = color;
       this.maxSpeed = maxSpeed;
   }

}
