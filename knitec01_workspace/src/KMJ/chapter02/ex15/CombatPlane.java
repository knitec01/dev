package KMJ.chapter02.ex15;

//
public class CombatPlane extends Airplane{
    //
    public static final int NORMAL = 0;
    // SupersonicAirplane객체들간의 공유하는 불변 값.
    public static final int FIGHTER = 1;

    // 상태 필드 선언
    public int flyMode = NORMAL;

    // @Override: 메소드 오버라이딩 문법 검사
    @Override
    public void fly() {
        if(flyMode == FIGHTER){
            System.out.println("전투 비행합니다.");
        }
        else {
            super.fly();
        }
    }
}
