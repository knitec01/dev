package KMJ.chapter02.ex01;

public class Phone {
    // 모델
    String model;
    // 색상
    String color;
    // 디스플레이 크기
    int displaySize;

    // model: 갤럭시, 아이폰
    Phone(String model){
        // 매개변수가 3개인 'Phone'이라는 이름의 생성자 호출
        // model의 값은 생성자 호출시에 받은 값.
        this(model, "은색", 8);
    }

    // 생성자 오버로딩 (매개변수의 타입정보, 개수)
    Phone(String model, String color){
        // this() 다른 생성자를 호출하는 코드
        this(model, color, 16);
    }

    //
    Phone(String model, String color, int displaySize){
        this.model = model;
        this.color = color;
        this.displaySize = displaySize;
    }
}
