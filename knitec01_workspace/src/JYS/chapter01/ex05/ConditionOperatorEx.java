package JYS.chapter01.ex05;

public class ConditionOperatorEx {
    public static void main(String[] args) {
        int score = 85;

        //물음표의 조건절을 파악해서, 참이면 콜론 앞 아니면 콜론 뒤
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');

        System.out.println(grade);
    }
}
