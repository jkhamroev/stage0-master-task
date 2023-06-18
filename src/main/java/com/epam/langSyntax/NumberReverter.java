package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int result = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            number = number / 10;
            result = result * 10 + lastDigit;
        }
        System.out.println(result);
    }

}
