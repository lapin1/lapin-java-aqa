package com.andersenlab.lapin.main;

import java.util.Scanner;

public class Task02 {
    public static void printName() {
        Scanner sc = new Scanner(System.in);

        String necessaryName = "Вячеслав";
        String result;
        String helloString = "Привет, Вячеслав";
        String noFoundName = "Нет такого имени";

        System.out.println("Введите имя: > ");
        String name = sc.nextLine();

        result = (name.equalsIgnoreCase(necessaryName)) ? helloString : noFoundName;
        System.out.println(result);

    }
}
