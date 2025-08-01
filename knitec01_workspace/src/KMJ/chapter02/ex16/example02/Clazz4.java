package KMJ.chapter02.ex16.example02;

import KMJ.chapter02.ex16.example01.Clazz1;

public class Clazz4 extends Clazz1 {
    public Clazz4(){
        // 부모 클래스의 매개변수가 없는 생성자 호출
        // super()를 호출하지 않아도 묵시적으로 컴파일러가 자동으로 삽입해서 실행.
        // 단!, super()의 호출은 반드시 첫 번째 줄에 작성되어야 함.
        // 또한 부모 클래스에서 매개변수가 있는 생성자만을 정의한 경우 부모 클래스에서 매개변수가 없는
        // 생성자를 자동으로 삽입하지 않게되고 아래의 부모 클래스의 생성자 호출 코드는 오류를 발생시키게 됨.
        super();
    }

    public void method(){
        // A 필드값 변경
        this.field = "value";
        this.method();
    }

    public void method2(){
        // Clazz의 생성자, 필드, 메소드는 모두 protected 접근 지정을 가지므로
        // 아래의 코드는 오류
//        Clazz1 clazz1 = new Clazz1();
//        clazz1.field = "value";
//        clazz1.method();
    }
}
