package me.yourqyert.aitu;

import java.util.Scanner;

public class Task12 {

    public static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }

        int max = findMax(arr, index + 1);
        return Math.max(arr[index], max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMax(arr, 0));
    }
}