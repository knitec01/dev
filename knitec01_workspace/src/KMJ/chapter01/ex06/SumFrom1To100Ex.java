package KMJ.chapter01.ex06;

public class SumFrom1To100Ex {
    public static void main(String[] args) {
        int sum = 0;
        int i;

        // for(초기식; 조건식; 증감식){ }의 형태
        for(i = 1; i<100; i++){
            // sum = sum + i;
            sum += i;
        }

        System.out.println("1~" + (i-1) + "합 : " + sum);
    }
}