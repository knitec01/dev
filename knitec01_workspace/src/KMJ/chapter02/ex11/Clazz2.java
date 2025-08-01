package KMJ.chapter02.ex11;

public class Clazz2 {
    // 생성자가 1개이고 매개변수 타입이 boolean타입인 생성자 호출
    Clazz1 clazz1 = new Clazz1(false);
    // 생성자가 1개이고 매개변수 타입이 int타입인 생성자 호출
    Clazz1 clazz2 = new Clazz1(3);

    // 생성자의 접근 지정이 private로 선언된 경우 사용 불가.
    // Clazz1 clazz3 = new Clazz1("홍길동");
}
