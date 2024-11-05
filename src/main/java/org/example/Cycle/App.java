package org.example.Cycle;


import java.util.Arrays;
import java.util.Scanner;


public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        compareArrayWithConstant(createArray());
    }


    public static int[] createArray() {
        int size;
        int[] array = null;

        while (true) {
            System.out.println("Указжите размер массива: ");

            if (scanner.hasNextInt() && (size = scanner.nextInt()) > 0) {
                array = new int[size];
                break;
            } else {
                System.out.println("Некорректное значение. Введите целое число больше нуля: ");
                scanner.next();
            }
        }


        for (int i = 0; i < array.length; i++) {
            while (true) {
                System.out.println("Укажите " + (i + 1) + " элемент массива: ");
                if (scanner.hasNextInt()) {
                    array[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Некорректное значение. Введите целое число: ");
                    scanner.next();
                }
            }
        }
        return array;
    }


    public static boolean compareArrayWithConstant(int[] array) {
        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);
        int z = (int) (Math.random() * 10);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x || array[i] == y || array[i] == z) {
                System.out.println("x = " + x + ", y = " + y + ", z = " + z);
                System.out.println("Данное значение имеется в константах.");

                return true;
            }
        }
        System.out.println("Совпадения не обнаружено.");
        return false;
    }


}







