package Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int key = sc.nextInt();

        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == key) {
                System.out.println(a[mid]); // exact match
                return; // exit program
            }

            if (a[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // If not found, decide nearest
        if (low >= n) {
            System.out.println(a[n - 1]); // key > largest element
        } else if (high < 0) {
            System.out.println(a[0]); // key < smallest element
        } else {
            // Compare distance to neighbors
            if (key - a[high] <= a[low] - key) {
                System.out.println(a[high]);
            } else {
                System.out.println(a[low]);
            }
        }
    }
}
