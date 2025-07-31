package JYS.chapter02.ex08;

public class Korean {
    // 인스턴스 final 필드 선언(초기값 혹은 생성자 대입 필수)
    final String nation = "대한민국";
    final String ssn;// 초기값을

    // 인스턴스 필드 선언
    String name;

    // 생성자 선언
    public Korean(String ssn, String name){
        this.ssn = ssn;
        this.name = name;
    }


}
