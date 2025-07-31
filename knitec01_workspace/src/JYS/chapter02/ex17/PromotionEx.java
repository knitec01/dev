package JYS.chapter02.ex17;

class A{

}

class B extends A{

}

class C extends A{

}

class D extends B{

}

class E extends C{

}

public class PromotionEx {
    public static void main(String[] args) {
        // 자동 타입 변환(Promotion) 큰타입에 작은 타입을 강제형변환 없이 대입할 수 있따.
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

        //B b3 = e;
        //C c2 = d;
    }
}
