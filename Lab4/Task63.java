package Lab4;

import java.util.Arrays;
import java.util.Random;

public class Task63 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {4, 15, 9, 19, 1, -7, 2, 10};
        int[] c = {0, 4, 29, 46, -18};
        printResults(a);
        printResults(b);
        printResults(c);
        printResults(randomArrayGenerator(-100, 100, 7));
    }

    static int[] createNewArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] += findMax(arr);
            }
            else if(arr[i] > 0) {
                arr[i] *= 2;
            }
            else {
                arr[i] = 1;
            }
        }
        return arr;
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

    static int[] randomArrayGenerator(int min, int max, int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            arr[i] = randomNumber;
        }
        return arr;
    }

    static void printResults(int[] arr) {
        System.out.println("array:" + Arrays.toString(arr) + " new array:" + Arrays.toString(createNewArray(arr)));
    }
}