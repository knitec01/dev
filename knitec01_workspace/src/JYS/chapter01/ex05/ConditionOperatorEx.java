package JYS.chapter01.ex05;

public class ConditionOperatorEx {
    public static void main(String[] args) {
        int score = 85;
        
        // 삼항연산자 (조건식) ? true인 경우 : false인 경우
        // 아래의 문장은 2개의 삼항 연산자를 연속적으로 사용
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
    }
}
