package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            System.out.print(" ".repeat(cathetusLength - i));
            for (int j = i; j >= 2; j--) {
                System.out.print(j);
            }
            System.out.print(1);
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(9);
    }

}
