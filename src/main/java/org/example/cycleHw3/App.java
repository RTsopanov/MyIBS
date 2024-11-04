package org.example.cycleHw3;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        avgArray(createArray());
//        createArray();
    }


    public static double[] createArray() {
        int size = -1;
        double[] array = null;

        while (true) {
            while (true) {
                System.out.println("Указжите размер массива: ");
                if (!scanner.hasNextDouble()) {
                    System.out.println("Некорректное значение. Введите целое число: ");
                    scanner.next();
                } else break;
            }


            if (scanner.hasNextDouble()) {
                size = scanner.nextInt();

                if (size > 0) {
                    array = new double[size];
                    for (int i = 0; i < array.length; i++) {
                        System.out.println("Укажите " + (i + 1) + " элемент массива: ");
                        while (size != 0) {
                            if (!scanner.hasNextDouble()) {
                                System.out.println("Некорректное значение. Введите целое число: ");
                                scanner.next();
                            } else {
                                array[i] = scanner.nextInt();
                                size--;
                            }
                            break;
                        }
                        if (size == 0) {
                            System.out.println(Arrays.toString(array));
                        }
                    }
                } else {
                    System.out.println("Размер массива должен быть целым положительным числом. Повторите ввод: ");
                    continue;
                }
            }
            break;
        }

        return array;
    }


    public static double[] avgArray(double[] array) {
        double avg = 0;
        double[] arr = null;

        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }

        avg /= (array.length);
        System.out.println("Среднее арифметическое: " + avg);

        for (int i = 0; i < array.length; i++) {
            array[i] *= avg;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }


}

