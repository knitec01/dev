package KMJ.chapter02.ex05;

public class Calculator {
    static double pi = 3.14159;

    static int plus(int x, int y){
        return x + y;
    }

    static int minus(int x, int y){
        return x - y;
    }

    int nonStaticPlus(int x, int y){
        return x + y;
    }
}
