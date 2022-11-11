package com.andersenlab.lapin.main;

import java.util.Scanner;

public class Task01 {
    public static void printHelloWord() {
        Scanner sc = new Scanner(System.in);
        String result;
        String suitableValueMessage = "Привет";
        String unsuitableValueMessage = "Число <= 7";

        System.out.println("Введите число: > ");
        while (!sc.hasNextInt()) {
            System.out.println("Введите число типа int: ");
            sc.next();
        }
        int value = sc.nextInt();

        result = (value > 7) ? suitableValueMessage : unsuitableValueMessage;
        System.out.println(result);

    }
}
