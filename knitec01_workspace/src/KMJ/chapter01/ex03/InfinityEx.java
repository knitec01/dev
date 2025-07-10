package KMJ.chapter01.ex03;

public class InfinityEx {
    public static void main(String[] args) {

        int x = 5;

        // 실수형 0.0
        double y = 0.0;

        // 정수형 0
        int y_ = 0;

        double z = x / y;

        double z_ = x / y_;

        // Infinity 혹은 NaN(Not a Number)
        System.out.println(z);

        // ArithmeticException 발생.
        System.out.println(z_);

        // 정리. 나누는 수의 자료형에 따라서 결과가 달라질 수 있으므로 주의.
    }
}
