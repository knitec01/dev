package KMJ.chapter03.ex01;

// 상속을 해주는 전용 클래스
// 직접 인스턴스를 만들기 위해 클래스가 아님.
// 설계도 만을 제공
public abstract class Bicycle {
    String owner;

    public Bicycle(String owner) {
        this.owner = owner;
    }

    void run(){
        System.out.println("굴러갑니다.");
    }

    void stop(){
        System.out.println("멈췄습니다.");
    }
}
