package KMJ.chapter02.ex14;

import KMJ.chapter02.ex05.Calculator;

public class SuperComputerEX {
    public static void main(String[] args) {
        int r = 10;

        // Ctrl + Alt + V
        Computer computer = new Computer();
        System.out.println("원의 면적: " + computer.calculateAreaCircle(r));
        System.out.println();

        SuperComputer superComputer = new SuperComputer();
        System.out.println("원의 면적: " + superComputer.calculateAreaCircle(r));
    }
}
