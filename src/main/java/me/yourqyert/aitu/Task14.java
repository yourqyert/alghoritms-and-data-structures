package me.yourqyert.aitu;

import java.util.Scanner;

public class Task14 {

    public static boolean linearSearch(int[] arr, int index, int target) {
        if (index == arr.length) {
            return false;
        }

        if (arr[index] == target) {
            return true;
        }

        return linearSearch(arr, index + 1, target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        if (linearSearch(arr, 0, target)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
}