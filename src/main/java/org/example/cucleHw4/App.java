package org.example.cucleHw4;
import java.util.Scanner;






    public class App {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Запрос на ввод размерности матрицы
            System.out.println("Введите количество строк матрицы:");
            int numOne = scanner.nextInt();
            System.out.println("Введите количество столбцов матрицы:");
            int numTwo = scanner.nextInt();

            int[][] matrix = new int[numOne][numTwo];

            // Ввод элементов матрицы
            System.out.println("Введите элементы матрицы:");
            for (int i = 0; i < numOne; i++) {
                for (int j = 0; j < numTwo; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            scanner.close();

            // Вывод первой строки матрицы с элементами, умноженными на 3
            System.out.println("Первая строка матрицы, умноженная на 3:");
            for (int j = 0; j < numTwo; j++) {
                System.out.print(matrix[0][j] * 3 + " ");
            }
        }
    }

