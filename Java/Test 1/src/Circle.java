import java.util.Scanner;

public class Circle {
    private double A;
    private double B;
    private double r;
    private double x;
    private double y;

    public Circle Circle() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj Współrzędne Punktu Który Chcesz Sprawdzić (x, y):");
        System.out.print("x:");
        x = scanner.nextDouble();
        System.out.print("y:");
        y = scanner.nextDouble();
        Point a = new Point(x,y);

        System.out.println("Podaj Środek Okręgu (X, Y):");
        System.out.print("A:");
        A = scanner.nextDouble();
        System.out.print("B:");
        B = scanner.nextDouble();
        Point S = new Point(A, B);
        System.out.println("Podaj promień okręgu:");
        System.out.print("r:");
        r = scanner.nextDouble();
        Calculator calculator = new Calculator();
        calculator.CalculateCircle(a, S);
        return null;
    }
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

}
