package org.itmo.java.lesson1;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");


        //Task 2
        System.out.println((46 + 10) * 10d / 3);
        System.out.println(29 * 4 * (-15));


        //Task 3
        int number = 10500;
        double result = ((double) number / 10) / 10;
        System.out.println(result);


        //Task 4
        double a = 3.6d;
        double b = 4.1d;
        double c = 5.9d;
        double result2 = a * b * c;
        System.out.println(result2);


        //Task 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number");
        int thirdNumber = scanner.nextInt();
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);


        //Task 6
        System.out.println("Enter number");
        int thatNumber = scanner.nextInt();
        if (thatNumber % 2 == 1) {
            System.out.println("Нечётное");
        } else if (thatNumber <= 100) {
            System.out.println("Чётное");
        } else {
            System.out.println("Выход за пределы диапазона");
        }

    }

}
