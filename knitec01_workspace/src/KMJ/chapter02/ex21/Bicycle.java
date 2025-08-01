package KMJ.chapter02.ex21;

public class Bicycle {
    String owner;

    // 매개변수가 1개인 생성자
    // this: 호출한 객체에 대한 참조
    Bicycle(String owner){
        // 생성자 호출시에 넘어오는 값.
        // 1. bike1에 대한 고유한 참조 this(누가 생성자를 호출했는지 구분할 수 있는 식별자)
        // 2. "홍길동"

        // Bicycle 클래스의 필드 owner를 매개변수로 받은 owner로 초기화
        // 자신의 참조
        // 이 생성자 혹은 메소드를 호출한 객체를 가리킨다.
        this.owner = owner;
    }

    void run(){
        System.out.println("굴러갑니다.");
    }

    void stop(){
        System.out.println("멈췄습니다.");
    }
}
