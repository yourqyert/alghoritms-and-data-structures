package me.yourqyert.aitu;

import java.util.Scanner;

public class Task8 {

    // T - O(logn)
    public static void reverseNumber(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n % 10);
        reverseNumber(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.print(0);
        } else {
            reverseNumber(n);
        }
    }
}
