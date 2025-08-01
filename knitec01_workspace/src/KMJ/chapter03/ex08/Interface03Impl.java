package KMJ.chapter03.ex08;

public class Interface03Impl implements Interface03 {
    @Override
    public void method01() {
        System.out.println("Interface03Impl = Interface01() 실행");
    }

    @Override
    public void method02() {
        System.out.println("Interface03Impl = Interface02() 실행");
    }

    @Override
    public void method03() {
        System.out.println("Interface03Impl = Interface03() 실행");
    }
}
