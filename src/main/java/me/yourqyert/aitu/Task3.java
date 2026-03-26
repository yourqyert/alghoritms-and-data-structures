package me.yourqyert.aitu;

import java.util.Scanner;

public class Task3 {

    public static int sumToN(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumToN(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumToN(n));
    }
}