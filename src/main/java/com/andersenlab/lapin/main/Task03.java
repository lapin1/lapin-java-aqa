package com.andersenlab.lapin.main;

import java.util.Scanner;

public class Task03 {
    public static void printMultiples() {
        Scanner sc = new Scanner(System.in);
        int arrayLength;
        int[] array;

        System.out.println("Введите длину массива: > ");
        while (!sc.hasNextInt()) {
            System.out.println("Введите значение типа int > 0 ");
            sc.next();
        }

        //check correct length
        while (true) {
            arrayLength = sc.nextInt();
            if (arrayLength <= 0) {
                System.out.println("Введите значение типа int > 0 ");
            } else break;
        }
        array = new int[arrayLength];

        System.out.println("Введите значения элементов массива: >");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] : > ");
            while (!sc.hasNextInt()) {
                System.out.println("Введите значение типа int");
                sc.next();
            }
            array[i] = sc.nextInt();
        }

        for (int i : array) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }

}
