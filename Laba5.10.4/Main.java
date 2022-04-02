package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(10));
    }

    public static int getFactorial(int f) {
        int result = 1;

        for(int i = 1; i <= f; ++i) {
            result *= i;
            System.out.println(i);
        }

        return result;
    }
}
