package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int result = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            number = number / 10;
            result += lastDigit;
        }
        System.out.println(result);
    }

}
