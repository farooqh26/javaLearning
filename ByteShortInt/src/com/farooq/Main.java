package com.farooq;

public class Main {

    public static void main(String[] args) {

        byte myByteNumber = 10;
        short myShortNumber =  20;
        int myValue = 50;
        long totalLongNumber = 50000L + 10L * (myByteNumber + myShortNumber + myValue);
        System.out.println("longTotal =" + totalLongNumber);
    }
}