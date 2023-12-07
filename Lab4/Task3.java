package Lab4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {4, 15, 9, 19, 1, -7, 2, 10};
        int[] c = {0, 4, 29, 46, -18};
        printResults(a);
        printResults(b);
        printResults(c);
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void printResults(int[] arr) {
        System.out.println("array:" + Arrays.toString(arr) + " result:" + findMax(arr));
    }
}