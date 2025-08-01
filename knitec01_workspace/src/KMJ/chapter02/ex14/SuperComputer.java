package KMJ.chapter02.ex14;

import KMJ.chapter02.ex14.Computer;

public class SuperComputer extends Computer {
    // 메소드 오버라이딩(부모 클래스의 메소드를 재정의)
    @Override
    public double calculateAreaCircle(double r){
        System.out.println("SuperComputer 객체의 calculateAreaCircle() 실행");
        return Math.PI * r * r;
    }

    // 메소드 오버라이딩(부모 클래스의 메소드를 재정의)
    public int a(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return 3 * (int)r * (int)r;
    }
}
