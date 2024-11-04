package org.example.WorkingWithData3;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку из слов, разделенных пробелами:");

        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        int count = 0;

        System.out.println("Слова, состоящие только из латиницы:");
        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                System.out.print(word + " ");
                count++;
            }
        }
        System.out.println("\nКоличество слов, состоящих только из латиницы: " + count);
    }
}
