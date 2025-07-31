package JYS.chapter02.ex14;

public class Computer extends  Calculator{
    //메소드 오버라이드
    @Override
    public double areaCircle(double r) {

        System.out.println("Computer 객체의 areaCircle() 실행");
        return 3.1415 * r * r;

    }
}
