package me.yourqyert.aitu;

import java.util.Scanner;

public class Task13 {

    // T - O(logn)
    public static int countOccurrences(int[] arr, int index, int target) {
        if (index == arr.length) {
            return 0;
        }

        int count = (arr[index] == target) ? 1 : 0;
        return count + countOccurrences(arr, index + 1, target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        System.out.println(countOccurrences(arr, 0, target));
    }
}
