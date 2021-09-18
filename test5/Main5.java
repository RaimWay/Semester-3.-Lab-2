package test5;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("Выберите один из методов для использования:\n1. Сложение\n2. Вычитание\n3. Умножение\n4. Деление\n5. Возведение в степень\n6. Факториал");
        Scanner s = new Scanner(System.in);
        int selection = s.nextInt();
        if (selection == 1) {
            MathUtils.add();
        }
        if (selection == 2) {
            MathUtils.sub();
        }
        if (selection == 3) {
            MathUtils.mul();
        }
        if (selection == 4) {
            MathUtils.dev();
        }
        if (selection == 5) {
            MathUtils.exp();
        }
        if (selection == 6) {
            MathUtils.fac();
        }
        else {
            System.out.println("Неверный ввод");
        }
    }
}

class MathUtils {
    public static void add() {
        System.out.print("Введите количество чисел, которые вы хотите добавить: ");
        Scanner s1 = new Scanner(System.in);
        int amount = s1.nextInt();
        double result = 0;
        for (int i = 0; i < amount; i++) {
            System.out.print("Введите номер: ");
            Scanner s2 = new Scanner(System.in);
            double num = s2.nextDouble();
            result = result + num;
        }
        System.out.print("Результат сложения: ");
        System.out.println(result);
    }

    public static void sub() {
        System.out.print("Введите число для вычитания из: ");
        Scanner s1 = new Scanner(System.in);
        double num1 = s1.nextDouble();
        System.out.print("Введите число для вычитания: ");
        Scanner s2 = new Scanner(System.in);
        double num2 = s2.nextDouble();
        double result = num1 - num2;
        System.out.print("Результат вычитания: ");
        System.out.println(result);
    }

    public static void mul() {
        System.out.print("Введите количество чисел, которые вы хотите умножить: ");
        Scanner s1 = new Scanner(System.in);
        int amount = s1.nextInt();
        double result = 0;
        for (int i = 0; i < amount; i++) {
            System.out.print("Введите номер: ");
            Scanner s2 = new Scanner(System.in);
            double num = s2.nextDouble();
            result = result + num;
        }
        System.out.print("Результат умножения: ");
        System.out.println(result);
    }

    public static void dev() {
        System.out.print("Введите число для деления: ");
        Scanner s1 = new Scanner(System.in);
        double num1 = s1.nextDouble();
        System.out.print("Введите число для деления на: ");
        Scanner s2 = new Scanner(System.in);
        double num2 = s2.nextDouble();
        double result = num1 - num2;
        System.out.print("Результат деления: ");
        System.out.println(result);
    }

    public static void exp() {
        System.out.print("Введите число для возведения в степень: ");
        Scanner s1 = new Scanner(System.in);
        double num = s1.nextDouble();
        System.out.print("Введите число для возведения в степень на: ");
        Scanner s2 = new Scanner(System.in);
        double up = s2.nextDouble();
        double result = Math.pow(num,up);
        System.out.print("Результат возведения в степень: ");
        System.out.println(result);
    }

    public static void fac() {
        System.out.print("Введите число для нахождения факториала: ");
        Scanner s1 = new Scanner(System.in);
        int num = s1.nextInt();
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        System.out.print("Результат нахождения факториала: ");
        System.out.println(result);
    }
}
