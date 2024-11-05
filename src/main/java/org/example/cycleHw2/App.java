package org.example.cycleHw2;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(cycle());
    }

    public static int cycle() {
        int num = 0;
        int sum = 0;
        System.out.println("Введите целое полложительное число");
        while (true) {
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                if (num < 0) {
                    System.out.println("Число не может быть отрицательным. Повторите ввод");
                }
                else {

                    sum = IntStream.range(0, num)
                            .filter(i -> i % 2 != 0)
                            .sum();

                    scanner.close();
                    return sum;
                }
            } else {
                System.out.println("Некорректные данные. Повторите ввод");
                scanner.next();
            }
        }
    }

}
