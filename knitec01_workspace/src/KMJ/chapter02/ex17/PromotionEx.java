package KMJ.chapter02.ex17;

import KMJ.chapter03.ex09.*;

class Clazz1{

}

class Clazz2 extends Clazz1{

}

class Clazz3 extends Clazz1 {

}

class Clazz4 extends Clazz2 {

}

class Clazz5 extends Clazz3 {

}

public class PromotionEx {
    public static void main(String[] args) {
        // 자동 타입 변환(Promotion)
        // 큰 타입에 작은 타입을 강제 형변환 없이 대입할 수 있다.
        Clazz2 clazz2 = new Clazz2();
        Clazz3 clazz3 = new Clazz3();

        Clazz4 clazz4 = new Clazz4();
        Clazz5 clazz5 = new Clazz5();

        // Promotion
        // 부모 클래스의 타입에 대입
        Clazz1 clazzPromotion1 = clazz2;
        Clazz1 clazzPromotion2 = clazz3;

        // 부모 클래스의 타입에 대입
        Clazz1 clazzPromotion3 = clazz4;
        Clazz1 clazzPromotion4 = clazz5;

        // 부모 클래스의 타입에 대입
        Clazz2 clazzPromotion5 = clazz4;
        Clazz3 clazzPromotion6 = clazz5;

        // 부모 클래스의 타입이 아니므로 대입 불가
        // Clazz2 clazzPromotion7 = clazz5;
        // Clazz3 clazzPromotion8 = clazz4;
    }

}
