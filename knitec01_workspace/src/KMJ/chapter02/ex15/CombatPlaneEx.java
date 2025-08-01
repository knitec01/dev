package KMJ.chapter02.ex15;

public class CombatPlaneEx {
    public static void main(String[] args) {
        CombatPlane combatPlane = new CombatPlane();
        combatPlane.takeOff();
        combatPlane.fly();
        // 정적 멤버는 클래스의 이름으로 접근 가능.
        combatPlane.flyMode = CombatPlane.FIGHTER;
        combatPlane.fly();
        combatPlane.flyMode = CombatPlane.FIGHTER;
        combatPlane.land();
    }
}
