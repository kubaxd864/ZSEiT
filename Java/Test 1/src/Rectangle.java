import java.util.Scanner;

public class Rectangle {
    private double AB;
    private double BC;
    private double Pole;

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

        AB = Math.sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
        BC = Math.sqrt(Math.pow((c.getX() - b.getX()), 2) + Math.pow((c.getY() - b.getY()), 2));
        Pole = BC * AB;
        System.out.println("Pole Danego Prostokąta wynosi: " + Pole);

        scanner.close();
    }
}
