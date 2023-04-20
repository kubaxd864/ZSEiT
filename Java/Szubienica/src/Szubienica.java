import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Szubienica {

    private static final int MAX_WRONG = 8;
    private static final String[] WORDS = {"JABŁKO", "KOMPUTER", "KOT", "SŁONIE", "KRAKÓW", "SAMOCHOD", "LEKCJA", "KSIĄŻKA", "DZIEŃ", "NOC", "KOSZULKA", "KOSZMAR", "KOSZ", "KOSZT", "KOSZTY"};

    private String word;
    private String so_far;
    private int wrong;
    private ArrayList<String> used;

    public Szubienica() {
        Random rand = new Random();
        this.word = WORDS[rand.nextInt(WORDS.length)];
        this.so_far = "-".repeat(this.word.length());
        this.wrong = 0;
        this.used = new ArrayList<String>();
    }

    public void menu() {
        System.out.println("Witaj w grze szubienica");
        System.out.println("Wybierz opcję:");
        System.out.println("1. Graj");
        System.out.println("2. Wyjście");

        Scanner scanner = new Scanner(System.in);
        String menu_value = scanner.nextLine();

        if (menu_value.equals("1") || menu_value.equalsIgnoreCase("Graj")) {
            play();
        }
        else if (menu_value.equals("2") || menu_value.equalsIgnoreCase("Wyjście")) {
            System.out.println("Wyjście");
        }
        else {
            System.out.println("Nie ma takiej opcji");
            menu();
        }
    }

    public void play() {
        while (wrong < MAX_WRONG && !so_far.equals(word)) {
            System.out.println("Wykorzystane Litery: " + used);
            System.out.println("Hasło to: " + so_far);

            Scanner scanner = new Scanner(System.in);
            String guess = scanner.nextLine().toUpperCase();

            while (used.contains(guess)) {
                System.out.println("Już wykorzystałeś literę " + guess);
                guess = scanner.nextLine().toUpperCase();
            }

            used.add(guess);

            if (word.contains(guess)) {
                String newSoFar = "";
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess.charAt(0)) {
                        newSoFar += guess;
                    }
                    else {
                        newSoFar += so_far.charAt(i);
                    }
                }
                so_far = newSoFar;
            }
            else {
                System.out.println("Podana litera nie występuje w tym słowie");
                wrong += 1;
            }
        }

        if (wrong == MAX_WRONG) {
            System.out.println("Przegrałeś!");
        }
        else {
            System.out.println("Gratulacje!");
        }

        System.out.println("Hasłem było: " + word);
    }

    public static void main(String[] args) {
        Szubienica szubienica = new Szubienica();
        szubienica.menu();
    }
}