import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.Rectangle();
    }
}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
}

class Rectangle {
    public void Rectangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj współrzędne punktu A:");
        System.out.print("x:");
        double xA = scanner.nextDouble();
        System.out.print("y:");
        double yA = scanner.nextDouble();
        Point a = new Point(xA, yA);

        System.out.println("Podaj współrzędne punktu B:");
        System.out.print("x:");
        double xB = scanner.nextDouble();
        System.out.print("y:");
        double yB = scanner.nextDouble();
        Point b = new Point(xB, yB);

        System.out.println("Podaj współrzędne punktu C:");
        System.out.print("x:");
        double xC = scanner.nextDouble();
        System.out.print("y:");
        double yC = scanner.nextDouble();
        Point c = new Point(xC, yC);

        System.out.println("Podaj współrzędne punktu D:");
        System.out.print("x:");
        double xD = scanner.nextDouble();
        System.out.print("y:");
        double yD = scanner.nextDouble();
        Point d = new Point(xD, yD);

        System.out.println("Współrzędne punktu D to: (" + d.getX() + ", " + d.getY() + ")");

        scanner.close();
    }

}

class Circle {
        private double A;
        private double B;
        private double r;

        Circle(double A, double B, double r) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Podaj Środek Okręgu (X, Y):");
            A = scanner.nextDouble();
            B = scanner.nextDouble();

            System.out.println("Podaj promień okręgu:");
            r = scanner.nextDouble();

            this.A = A;
            this.B = B;
            this.r = r;

//            if (A == 0 && B == 0) {
//            odleglosc = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
//        } else {
//            odleglosc = Math.sqrt(Math.pow(x + A, 2) + Math.pow(y + B, 2));
//        }
//        if (odleglosc < r*r) {
//            System.out.println("Punkt (" + x + ", " + y + ") leży wewnątrz okręgu o promieniu " + r);
//        } else if (odleglosc == r*r) {
//            System.out.println("Punkt (" + x + ", " + y + ") leży na okręgu o promieniu " + r);
//        } else {
//            System.out.println("Punkt (" + x + ", " + y + ") leży poza okręgiem o promieniu " + r);
//        }
        }
}
