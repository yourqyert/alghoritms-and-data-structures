package me.yourqyert.aitu;

import java.util.Scanner;

public class Task6 {

    // T - O(n)
    // S - O(1)
    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumDigits(n));
    }
}
