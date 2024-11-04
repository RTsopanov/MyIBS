package org.example.WorkingWithData1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите первое число:");
        String firstNumberStr = scanner.nextLine();


        System.out.println("Введите второе число:");
        int secondNumber = scanner.nextInt();


        int firstNumber = Integer.parseInt(firstNumberStr);


        if (firstNumber > secondNumber) {
            System.out.println("Большее число: " + firstNumber);
            System.out.println("Меньшее число: " + (double) secondNumber);
        } else {
            System.out.println("Большее число: " + secondNumber);
            System.out.println("Меньшее число: " + (double) firstNumber);
        }

        scanner.close();


    }
}
