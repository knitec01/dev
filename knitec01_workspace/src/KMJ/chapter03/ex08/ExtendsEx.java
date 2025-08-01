package KMJ.chapter03.ex08;

public class ExtendsEx {
    public static void main(String[] args) {
        Interface03Impl impl = new Interface03Impl();

        Interface01 i01 = impl;
        i01.method01();
        // i01.method02();
        System.out.println();

        Interface02 i02 = impl;
        // i02.method01();
        i02.method02();
        System.out.println();

        Interface03 i03 = impl;
        i03.method01();
        i03.method02();
        i03.method03();
    }
}
