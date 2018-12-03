package com.farooq;

public class Main {

    public static void main(String[] args) {
        //normal char 16 width (2 bytes)
        char myChar = 'D';
        System.out.println("Char = " + myChar);
        //unicode character - special characters
        char myUnicodeChar = '\u00AE';
        System.out.println("Unicode = " + myUnicodeChar);
        //BOOLEAN
        boolean myBoolean = false;
        boolean isMale = true;
    }
}
