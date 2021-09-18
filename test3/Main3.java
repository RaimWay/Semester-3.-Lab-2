package test3;

public class Main3 {
    public static void main(String[] args) {
        A a = new A();
        a.count(2,3);
        a.show();

        B b = new B();
        b.count(2,3);
        b.show();

        C c = new C();
        c.count(2,3);
        c.show();

        D d = new D();
        d.count(4,2);
        d.show();
    }
}

class A {
    public void count(int a, int b) {
        int sum = a + b;
        System.out.print("Сумма: ");
        System.out.println(sum);
    }

    public void show() {
        System.out.println("Имя класса = A");
    }
}

class B extends A {
    public void count(int a, int b) {
        int sub = 0;
        if (b > a) {
            sub = b - a;
        }
        if (a >= b) {
            sub = a - b;
        }
        System.out.print("Разность: ");
        System.out.println(sub);
    }

    public void show() {
        System.out.println("Имя класса = B");
    }
}

class C extends A {
    public void count(int a, int b) {
        int mul = a * b;
        System.out.print("Умножение: ");
        System.out.println(mul);
    }

    public void show() {
        System.out.println("Имя класса = C");
    }
}

class D extends B {
    public void count(int a, int b) {
        int dev = a / b;
        System.out.print("Деление: ");
        System.out.println(dev);
    }

    public void show() {
        System.out.println("Имя класса = D");
    }
}