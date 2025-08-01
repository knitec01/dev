package KMJ.chapter03.ex02;

public abstract class Bicycle {
    public void standing(){
        System.out.println("페달로 정지합니다.");
    }

    // 추상 메소드는 메소드의 구현부가 없음.
    public abstract void pedaling();
}
