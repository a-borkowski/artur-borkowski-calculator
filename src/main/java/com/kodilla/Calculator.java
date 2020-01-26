package com.kodilla;

public class Calculator {
    public int addAToB(int a, int b) {
        return a + b;
    }
    public int subtractAFromB(int a, int b) {
        return a - b;
    }
}

class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int resultAdd = calculator.addAToB(2, 1);
        int resultSubtract = calculator.subtractAFromB(32, 2);
        System.out.println(resultAdd);
        System.out.println(resultSubtract);
    }
}
