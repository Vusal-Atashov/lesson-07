package az.edu.turing.module2.lesson14;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberArray = new int[scanner.nextInt()];
        int[] sortingArray = sortArray(fillRandomArray(numberArray));
        System.out.println(Arrays.toString(sortingArray));
        String[] stringArray=new String[]{"jhddf","sdiugds","ksdjhkds","sdkdsa"};

    }

    public static int[] fillRandomArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        return arr;
    }
}
