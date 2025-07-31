package JYS.chapter01.ex08;

public class EqualsEx {
    public static void main(String[] args) {
        String name;
        //'' : char형, "": 문자열(String)
        name = "홍길동";

        String hobby = "여행";

        String name2 = "홍길동";
        String name3 = "홍길동";
        String name4 = new String("홍길동");


        System.out.println(name2 == name3);
        System.out.println(name3 == name4);


    }
}
