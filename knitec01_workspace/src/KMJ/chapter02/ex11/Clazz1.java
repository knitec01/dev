package KMJ.chapter02.ex11;

public class Clazz1 {
    // 매개변수가 boolean타입 1개인 생성자를 호출
    Clazz1 clazz1 = new Clazz1(false);
    // 매개변수가 int타입 1개인 생성자를 호출
    Clazz1 clazz2 = new Clazz1(3);
    // 매개변수가 String타입 1개인 생성자를 호출
    Clazz1 clazz3 = new Clazz1("홍길동");

    public Clazz1(boolean b){

    }

    Clazz1(int i){

    }

    private Clazz1(String s){

    }
}
