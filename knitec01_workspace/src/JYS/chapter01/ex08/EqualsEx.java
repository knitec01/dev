package JYS.chapter01.ex08;

public class EqualsEx {
    public static void main(String[] args) {
        String name1;
        // '': char형 , "": 문자형(String)
        name1 = "고길동";

        // (""를 통해 생성한 문자열은 내용이 같은 경우 같은 저장된 메모리 공간을 공유해서 사용)
        String name2 = "고길동";
        // new 연산자는 메모리에 새로운 공간을 생성하고 그 곳에 값을 저장하므로 별도의 공간이 생성 됨.
        String name3 = new String("고길동");


        // true
        // 리터럴 문자열로 생성된 경우 메모리 공간을 공유하므로 아래의 결과는 true
        System.out.println(name1 == name2);

        // false
        // new 연산자로 생성된 문자열을 메모리 공간을 공유하지 않으므로 false
        System.out.println(name2 == name3);

    }
}
