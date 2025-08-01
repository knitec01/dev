package KMJ.chapter02.ex18;

public class ChildEx {
    public static void main(String[] args) {
        // Promotion(= UpCasting)
        // 부모 <- 자식
        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        // 순수 Parent의 멤버만 접근 가능.
        // (단, 자식에서 재정의(override)된 메소드가 있다면 실행가능.)
        // parent.field2 = "data2";
        // method overriding된 메소드 호출
        parent.method2();
        // method overriding 되지 않은 메소드 호출
        // parent.method3();

        // Casting(= DownCasting)
        // Promotion -> Casting
        // 부모 -> 자식
        Child child = (Child)parent;

        child.field1 = "data2";
        // child.method2();
    }
}
