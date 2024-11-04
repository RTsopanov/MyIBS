package org.example.WorkingWithData4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    static Random random = new Random();

    public static void main(String[] args) {
        findMaxAndMin(createArray());
    }


    public static int[] createArray() {
        int[] array = new int[15];

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(42) - 20;
        return array;
    }

    public static void findMaxAndMin(int[] arr) {
        int max = 0;
        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Максимальный элемент массива = " + max + "\nМинимальный элемент массива = " + min);

        int maxAbsValue = (Math.abs(max) > Math.abs(min) ? max : min);
        System.out.println("Максимальное абсолютное значение = " + maxAbsValue);
    }


}


