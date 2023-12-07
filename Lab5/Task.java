package Lab5;

import java.util.Arrays;
import java.util.Random;

public class Task {
    public static void main(String[] args) { //В методі main ми викликаємо описані нижче методи
        printInsertionSortedArray(randomArrayGenerator(-100, 100, 10));
        printBubbleSortedArray(randomArrayGenerator(-100, 100, 10));
    }

    static long[] insertionSort(long[] arr) { //Метод 1: Insertion sort (Сортування вставкою)
        for (int i = 1; i < arr.length; i++) {
            long key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    static long[] bubbleSort(long[] arr) { //Метод 2: Bubble sort (Сортування бульбашкою)
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    long temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    static long[] randomArrayGenerator(int min, int max, int size) { //Генератор випадкового масиву, який приймає діапазон чисел та розмір масиву
        Random random = new Random();
        long[] arr = new long[size];
        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min; //nextInt генерує числа в діапазоні від min до max, приймає в параметри (int bound) - загальна кількість можливих для генерування цілих чисел
            arr[i] = randomNumber;
        }
        return arr;
    }

    static void printInsertionSortedArray(long[] arr) { //Метод виводу масиву користувачу відсортованого через перший метод
        System.out.println("array:" + Arrays.toString(arr) + " new array:" + Arrays.toString(insertionSort(arr)));
    }

    static void printBubbleSortedArray(long[] arr) { //Метод виводу масиву користувачу відсортованого через другий метод
        System.out.println("array:" + Arrays.toString(arr) + " new array:" + Arrays.toString(bubbleSort(arr)));
    }
}