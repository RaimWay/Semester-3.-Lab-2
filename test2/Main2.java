package test2;

import java.util.Scanner;

public class Main2 {
    public static Roots getRoots(double a, double b, double c) {
        Roots r = new Roots();
        double d = (b * b) - 4 * a * c;
        if (d < 0) {
            r.setCount(0);
        }
        if (d > 0) {
            r.setX1((-b + Math.sqrt(d)) / 2 * a);
            r.setX2((-b - Math.sqrt(d)) / 2 * a);
            r.setCount(2);
        }
        if (d == 0) {
            r.setX1(-b / 2 * a);
            r.setX2(-b / 2 * a);
            r.setCount(1);
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println("Введите a, b и c с помощью ввода между: ");
        Scanner s1 = new Scanner(System.in);
        double a = s1.nextDouble();
        Scanner s2 = new Scanner(System.in);
        double b = s2.nextDouble();
        Scanner s3 = new Scanner(System.in);
        double c = s3.nextDouble();

        Roots r = getRoots(a, b, c);

        if (r.getCount() == 0) {
            System.out.println("Решений нет");
        }
        if (r.getCount() == 1) {
            System.out.print("Одно решение. X = ");
            System.out.println(r.getX1());
        }
        if (r.getCount() == 2) {
            System.out.print("Два решения.\nX1 = ");
            System.out.println(r.getX1());
            System.out.print("X2 = ");
            System.out.println(r.getX2());
        }
    }
}

class Roots {
    private double x1;
    private double x2;
    private int count;

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX1() {
        return x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getX2() {
        return x2;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}