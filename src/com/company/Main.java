package com.company;

public class Main {

    public static void main(String[] args) {
	    double varOne = 20.00;
        double varTwo = 80.00;
        double sum = varOne + varTwo;

        double remainder = sum % 40.00;

        if (remainder == 0){
            boolean isRemainderZero = true;
            System.out.println("Is the remainder zero? true");
        } else {
            boolean isRemainderZero = false;
            System.out.println("The remainder is " + remainder);
        }

    }
}
