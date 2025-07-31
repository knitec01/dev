package JYS.chapter02.ex12;

public class CarEx {
    public static void main(String[] args) {
        Car myCar = new Car();

        //Math.abs();

        //잘못된 속도 변경
        //speed필드를 -50으로 설정
        myCar.setSpeed(-50);
        System.out.println("현재 속도:" + myCar.getSpeed());

        myCar.setSpeed(60);
        System.out.println("현재 속도:" + myCar.getSpeed());

        if(!myCar.isStop())
        {
            myCar.setStop(true);
        }

        System.out.println("현재 속도:" + myCar.getSpeed());


    }
}
