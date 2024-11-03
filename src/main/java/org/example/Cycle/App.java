package org.example.Cycle;


import java.util.Arrays;
import java.util.Scanner;


public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        compareArrayWithConstant(createArray());
    }


    public static int[] createArray() {
        int size = -1;
        int[] array = null;

        while (true) {

            System.out.println("Указжите размер массива: ");

            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                if (size > 0) {
                    array = new int[size];


                    for (int i = 0; i < array.length; i++) {
                        System.out.println("Укажите " + (i + 1) + " элемент массива: ");
                        while (size != 0) {
                            if (!scanner.hasNextInt()) {
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
                }
            } else {
                System.out.println("Некорректное значение. Введите целое число: ");
                scanner.next();
            }
            break;
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







