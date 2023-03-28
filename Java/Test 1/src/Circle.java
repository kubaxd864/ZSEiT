import java.util.Scanner;

public class Circle {
    private double A;
    private double B;
    private double r;
    private double x;
    private double y;
    private double odleglosc;

    public void Circle() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj Współrzędne Punktu Który Chcesz Sprawdzić (x, y):");
        System.out.print("x:");
        x = scanner.nextDouble();
        System.out.print("y:");
        y = scanner.nextDouble();

        System.out.println("Podaj Środek Okręgu (X, Y):");
        System.out.print("A:");
        A = scanner.nextDouble();
        System.out.print("B:");
        B = scanner.nextDouble();
        System.out.println("Podaj promień okręgu:");
        System.out.print("r:");
        r = scanner.nextDouble();

        odleglosc = Math.sqrt(Math.pow(x - A, 2) + Math.pow(y - B, 2));

        if (odleglosc < r) {
            System.out.println("Punkt (" + x + ", " + y + ") leży wewnątrz okręgu o promieniu " + r);
        } else if (odleglosc == r) {
            System.out.println("Punkt (" + x + ", " + y + ") leży na okręgu o promieniu " + r);
        } else {
            System.out.println("Punkt (" + x + ", " + y + ") leży poza okręgiem o promieniu " + r);
        }

        this.A = A;
        this.B = B;
        this.r = r;

    }
}
