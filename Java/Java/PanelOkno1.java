import javax.swing.*;

public class PanelOkno1 
{
    public static void main(String[] args)
    {
        String pytanie = "Nazwa pliku:";
        String tytuł = "Zapisywanie pliku";

        String odpowiedz = (String)JOptionPane.showInputDialog(null, pytanie, tytuł, JOptionPane.QUESTION_MESSAGE);
        
        System.out.println("Nazwa pliku: " + odpowiedz);
    }    
}
