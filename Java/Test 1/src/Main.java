import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość boku a:");
        double a = scanner.nextDouble();

        System.out.println("Podaj długość boku b:");
        double b = scanner.nextDouble();

        double pole = a * b;

        System.out.println("Pole powierzchni prostokąta wynosi: " + pole);

        System.out.println("Podaj współrzędne punktu który chcesz sprawdzić (x, y):");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        System.out.println("Podaj Środek Okręgu (X, Y):");
        double X = scanner.nextDouble();
        double Y = scanner.nextDouble();

        System.out.println("Podaj promień okręgu:");
        double r = scanner.nextDouble();

        if(X == 0 || Y == 0) {
            double odleglosc = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        } else{
            double odleglosc = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        }

        if (odleglosc < r) {
            System.out.println("Punkt (" + x + ", " + y + ") leży wewnątrz okręgu o promieniu " + r);
        } else if (odleglosc == r) {
            System.out.println("Punkt (" + x + ", " + y + ") leży na okręgu o promieniu " + r);
        } else {
            System.out.println("Punkt (" + x + ", " + y + ") leży poza okręgiem o promieniu " + r);
        }

        scanner.close();
    }
}