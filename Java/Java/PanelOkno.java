import javax.swing.*;

public class PanelOkno
{
    public static void main(String[] args)
    {
        String [] propozycje = {"Tak, zapisz", "Raczej nie", "Anuluj"};
        String pytanie = "Czy chcesz zapisać zmiany na dysku?";
        String tytuł = "Zapisywanie dokumentu";
        String komunikat;

        int odpowiedz = JOptionPane.showOptionDialog(null, pytanie, tytuł,
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, propozycje, propozycje[1]);

        switch (odpowiedz)
        {
            case JOptionPane.YES_OPTION:
                komunikat = "TAK";
                break;
            case JOptionPane.NO_OPTION:
                komunikat = "NIE";
                break;
            case JOptionPane.CANCEL_OPTION:
                komunikat = "ANULUJ";
                break;
            default:
                komunikat = "???";
                break;


        }
        System.out.println("Odpowiedź: " + komunikat);   
    }
}