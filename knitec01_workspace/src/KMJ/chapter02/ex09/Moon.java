package KMJ.chapter02.ex09;

public class Moon {
    // 상수 선언 및 초기화
    static final double MOON_RADIUS = 1000;

    // 상수 선언
    static final double MOON_SURFACE_AREA;

    // 정적 블록에서 상수 초기화
    static {
        MOON_SURFACE_AREA = 3 * Math.PI * MOON_RADIUS * MOON_RADIUS;
    }

}
