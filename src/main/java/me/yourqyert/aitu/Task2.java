package me.yourqyert.aitu;

import java.util.Scanner;

public class Task2 {

    // T - O(n)
    // S - O(1)
    public static void printDescending(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printDescending(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDescending(n);
    }
}