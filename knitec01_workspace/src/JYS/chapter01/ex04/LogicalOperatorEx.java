package JYS.chapter01.ex04;

public class LogicalOperatorEx {
    public static void main(String[] args) {
        // 'A' == 65
        int charCode = 'A';

        // 두 조건문 모두 비교
        if((65 >= charCode) & (charCode <= 90)){
            System.out.println("대문자이군요.");
        }

        // 두 조건문 중 앞의 조건문이 거짓이면 뒤에 조건문을 검증하지 않음.
        // (AND는 앞의 값이 거짓이라면 뒤에 값과는 관계없이 항상 false를 보장받으므로.)
        if((122 >= charCode) && (charCode <= 122)){
            System.out.println("소문자이군요.");
        }

    }
}
