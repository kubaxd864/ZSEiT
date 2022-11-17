import javax.swing.*;

public class PanelOkno2 
{
    public static void main(String[] args)
    {
        String[] propozycje = {"C:(System)", "D:(Dane)", "E:(Zapas)"};
        String pytanie = "Na którym dysku zapisać plik?";
        String tytuł = "Zapisywanie pliku";
        
        String odpowiedz = (String)JOptionPane.showInputDialog(null, pytanie, tytuł, JOptionPane.QUESTION_MESSAGE, null, propozycje, propozycje[1]);
        
        System.out.println("Odpowiedź: " + odpowiedz);
    }        
}
