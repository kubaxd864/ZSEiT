import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj co chcesz dziś Obliczyć?");
        System.out.println("1. Pole Prostokąta");
        System.out.println("2. Sprawdzić czy punkt znajduje się w okręgu");
        String Option = scanner.nextLine();
        if (Option.equals("Pole Prostokąta") || Option.equals("1")){
            Rectangle rectangle = new Rectangle();
            rectangle.Rectangle();
        }
        else if (Option.equals("Sprawdzić czy punkt znajduje się w okręgu") || Option.equals("2")){
            Circle circle = new Circle();
            circle.Circle();
        }
        else {
            System.out.println("Wybrano Niedostępną Opcję");
        }
    }
}
