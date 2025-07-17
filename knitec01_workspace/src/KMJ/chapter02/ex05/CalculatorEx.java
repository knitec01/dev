package KMJ.chapter02.ex05;

public class CalculatorEx {
    public static void main(String[] args) {
        //
        double result1 = 20 * 20 * Calculator.pi;

        int result2 = Calculator.plus(20, 10);

        int result3 = Calculator.minus(20, 5);

        Calculator calculator = new Calculator();

        // non-static member는 반드시 객체 생성이후에 접근해야 함.
        calculator.nonStaticPlus(30,5);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
    }
}
