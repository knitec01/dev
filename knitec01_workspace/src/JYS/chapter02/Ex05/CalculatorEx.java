package JYS.chapter02.Ex05;

public class CalculatorEx {
    public static void main(String[] args) {
        //정적 멤버는 선언 없이 사용가능
        double result1 = 10 * 10 * Calculator.pi;

        int result2 = Calculator.plus(10,5);

        int result3 = Calculator.minus(10,5);

        Calculator calculator = new Calculator();

        int result4 = calculator.nonStaitcPlus(10,5);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
        System.out.println("result4 : " + result4);
    }
}
