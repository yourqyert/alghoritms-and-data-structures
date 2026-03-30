package me.yourqyert.aitu;

import java.util.Scanner;

public class Task1 {

    // T - O(n)
    // S - O(1)
    public static void printAscending(int n) {
        if (n == 0) {
            return;
        }
        printAscending(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printAscending(n);
    }
}