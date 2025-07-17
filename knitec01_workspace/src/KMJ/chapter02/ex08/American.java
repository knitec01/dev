package KMJ.chapter02.ex08;

public class American {
    // 인스턴스 final 필드 선언
    // final은 초기에 값이 반드시 설정되어야 하며 초기에 값을 설정하는 방법은 아래와 같습니다.
    // 1. 아래의 nation과 같이 값 설정
    // 2. 생성자를 통한 값 설정
    // 3. 초기화 블록을 이용한 값 설정
    final String nation = "USA";
    final String ssn;

    // 인스턴스 필드 선언
    String name;

    // 생성자 선언
    public American(String ssn, String name){
        this.ssn = ssn;
        this.name = name;
    }

    
    // 초기화 블록
    {


    }
}
