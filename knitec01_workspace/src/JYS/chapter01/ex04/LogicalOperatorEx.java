package JYS.chapter01.ex04;

public class LogicalOperatorEx {
    public static void main(String[] args) {
        int charCode = 'a';

        //두 조건문 모두 비교
        if((65<=charCode)&(charCode<=90)){
            System.out.println("대문자이군요");
        }

        //두 조건문 중 앞 조건문이 참이라면 뒤 조건을 판단하지 않음
        if((97<=charCode)&&(charCode<=122)){
            System.out.println("소문자이군요");
        }
    }
}
