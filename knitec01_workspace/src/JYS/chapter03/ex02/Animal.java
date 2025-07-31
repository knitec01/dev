package JYS.chapter03.ex02;

public abstract class Animal {
    public  void  breathe(){
        System.out.println("숨을 쉽니다.");
    }

    //추상 메소드는 메소드의 구현이 없다.
    public abstract void  sound();

}
