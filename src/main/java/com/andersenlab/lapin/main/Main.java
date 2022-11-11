package com.andersenlab.lapin.main;

import java.util.Scanner;

import static com.andersenlab.lapin.main.Task01.printHelloWord;
import static com.andersenlab.lapin.main.Task02.printName;
import static com.andersenlab.lapin.main.Task03.printMultiples;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int taskNumber;

        System.out.println("Выберите номер задания: ");
        System.out.println("1. если введенное число > 7, вывести «Привет»");
        System.out.println("2. если введенное имя - Вячеслав, то вывести «Привет, Вячеслав»");
        System.out.println("3. вывести элементы массива кратные 3");
        System.out.println("4. Выход");

        while (!sc.hasNextInt()) {
            System.out.println("Введите номер задания от 1 до 3");
            sc.next();
        }

        //check correct number task
        while (true) {
            taskNumber = sc.nextInt();
            if (taskNumber <= 0 || taskNumber > 4) {
                System.out.println("Введите номер задания от 1 до 3");
            } else break;
        }

        switch (taskNumber) {
            case (1):
                printHelloWord();
                break;
            case (2):
                printName();
                break;
            case (3):
                printMultiples();
                break;
            case (4):
                System.exit(0);
        }

    }

}

