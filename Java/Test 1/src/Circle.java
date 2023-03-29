import java.util.Scanner;

public class Circle {
    private double A;
    private double B;
    private static double r;
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
        Calculator calculator1 = new Calculator();
        calculator1.CalculateCircle(a, S);
        return null;
    }

    public static double getR() {
        return r;
    }
}
