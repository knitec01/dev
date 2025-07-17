package KMJ.chapter02.ex03;

// 하나의 .java 파일의 public으로 존재할 수 있는 클래스는 오직 하나이며
// public으로 작성된 클래스의 이름이 .java 파일의 이름이 됨.
public class Computer {
    public static void main(String[] args) {
        // 1. new 연산자 (1. 메모리상에 실체를 만듦. 2. 만들어진 메모리의 주소를 반환)
        // 2. 생성자 호출
        GPU gpu = new GPU();
    }
}

class GPU {

}