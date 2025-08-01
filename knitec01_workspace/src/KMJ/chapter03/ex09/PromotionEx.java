package KMJ.chapter03.ex09;

public class PromotionEx {
    public static void main(String[] args) {
        Clazz02 clazz02 = new Clazz02();
        Clazz03 clazz03 = new Clazz03();
        Clazz04 clazz04 = new Clazz04();
        Clazz05 clazz05 = new Clazz05();

        Clazz01 clazz01;

        // clazz01 = clazz02;
        clazz01 = (Clazz01) clazz02;
        clazz01 = clazz03;
        clazz01 = clazz04;
        clazz01 = clazz05;
    }
}
