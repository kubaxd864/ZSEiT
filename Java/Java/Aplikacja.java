import javax.swing.*;

public class Aplikacja {

  private static void zrobOkono() {

    JFrame okno = new JFrame("Aplikacja");
    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // okno.setContentPane(new PanelZawartosc());
    // okno.setContentPane(new PanelDzielony());
    // okno.setContentPane(new PanelZakladki());
    // okno.setContentPane(new PanelEtykieta());
    // okno.setContentPane(new PanelPoleTekst());
    // okno.setContentPane(new PanelPoleTekst2());
    // okno.setContentPane(new PanelPoleTekst3());
    // okno.setContentPane(new PanelObszarTekst());
    // okno.setContentPane(new PanelLista());
    // okno.setContentPane(new PanelLista1());
    // okno.setContentPane(new PanelOpcja());
    // okno.setContentPane(new PanelOpcja2());
    // okno.setContentPane(new PanelPrzycisk());
    // okno.setContentPane(new PanelPasek());
    // okno.setContentPane(new PanelPostep());
    // okno.setContentPane(new PanelPisanie());
    // okno.setContentPane(new PanelRysowanie());
    // okno.setContentPane(new PanelFlowLayout());
    // okno.setContentPane(new PanelBoxLayout());
    // okno.setContentPane(new PanelBorderLayout());
    // okno.setContentPane(new PanelGridLayout());
    // okno.setContentPane(new PanelGridBagLayout());
    // okno.setContentPane(new PanelSpringLayout());
    //okno.setContentPane(new ZdarzeniaAkcja());
    //okno.setContentPane(new ZdarzeniaKlawiatura());
    okno.setContentPane(new ZdarzeniaMysz());
    //okno.setContentPane(new PanelMenuKontekst());



    okno.setBounds(100,50,300,150);
    okno.setVisible(true);

  }

  public static void main(String[] args) {

    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        zrobOkono();
      }
    });
  }
}
