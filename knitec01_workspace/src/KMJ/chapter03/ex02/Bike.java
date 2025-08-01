package KMJ.chapter03.ex02;

public class Bike extends Bicycle {

    // 추상 메소드의 역할: 강제화, 규격화
    // 반드시 자식 클래스에서 재정의(method overriding)해야함.
    @Override
    public void pedaling (){
        System.out.println("페달을 밟습니다.");
    }
}
