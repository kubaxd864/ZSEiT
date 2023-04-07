import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cabrio car = new Cabrio("Mazda MX-5", "Mazda");
        Scanner scanner = new Scanner(System.in);
        String Option;
        do {
            System.out.println("1. Jazda do Przodu");
            System.out.println("2. Zatrzymaj samochód");
            System.out.println("3. Otwórz Dach");
            System.out.println("4. Zamknij Dach");
            System.out.println("5. Wyjdź z programu");
            Option = scanner.nextLine();

            switch (Option) {
                case "1":
                case "Jazda do Przodu":
                    car.start();
                    break;
                case "2":
                case "Zatrzymaj samochód":
                    car.stop();
                    break;
                case "3":
                case "Otwórz Dach":
                    car.openRoof();
                    break;
                case "4":
                case "Zamknij Dach":
                    car.closeRoof();
                    break;
                case "5":
                    System.out.println("Program zakończony.");
                    break;
                default:
                    System.out.println("Niepoprawna opcja. Spróbuj ponownie.");
                    break;
            }
        } while (!Option.equals("5"));
    }
}