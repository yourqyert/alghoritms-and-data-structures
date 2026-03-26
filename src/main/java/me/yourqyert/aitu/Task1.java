package me.yourqyert.aitu;

public class Main {

    public static void main(String[] args) {
        printNumbers(5);
    }

    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }

        printNumbers(n - 1);
        System.out.print(n + " ");
    }
}