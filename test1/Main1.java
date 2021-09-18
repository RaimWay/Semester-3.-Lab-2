package test1;

public class Main1 {
    public static void main(String[] args) {
        Circle s = new Circle();
        s.setR(3.4);
        s.setX(-9);
        s.setY(1.2);

        s.print();
        s.move();
        System.out.print("Расстояние от других кругов Distant to other circle: ");
        System.out.println(s.distToOtherCircle());
        s.changeRadius();
        System.out.print("Периметр круга: ");
        System.out.println(s.getPerimetr());
        System.out.print("Площадь круга: ");
        System.out.println(s.getSquare());
    }
}

class Circle {
    private double r;
    private double x;
    private double y;

    public void setR(double r) {
        this.r = r;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void print() {
        System.out.print("Радиус = ");
        System.out.println(r);
        System.out.print("Current cords:\nX = ");
        System.out.println(x);
        System.out.print("Y = ");
        System.out.println(y);
    }

    public void move() {
        System.out.println("Круг был перемещен");
    }

    public double distToOtherCircle() {
        double dist = 1.5;
        return dist;
    }

    public void changeRadius() {
        System.out.println("Без комментариев...");
    }

    public double getPerimetr() {
        double perimetr = 2 * Math.PI * r;
        return perimetr;
    }

    public double getSquare() {
        double square = Math.PI * r * r;
        return square;
    }
}
