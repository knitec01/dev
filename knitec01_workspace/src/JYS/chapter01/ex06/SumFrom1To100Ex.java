package JYS.chapter01.ex06;

public class SumFrom1To100Ex {
    public static void main(String[] args) {
        int sum = 0;
        int i;

        for(i=1;i<100;i++){
            // sum = sum + i;
            sum += i;
        }

        System.out.println("1~" + (i-1) + "합 : " + sum);
    }
}
