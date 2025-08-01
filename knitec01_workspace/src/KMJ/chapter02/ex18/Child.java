package KMJ.chapter02.ex18;

public class Child extends Parent{
    public String field2;

    public void method3(){
        System.out.println("Child의 method3()");
    }

    @Override
    public void method2(){
        System.out.println("Child의 method2");
    }
}
