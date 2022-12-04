public class KasjerWplata implements Runnable
{
    konto konto;
    double kwota;

    public KasjerWplata(konto konto, double kwota)
    {
        this.konto = konto;
        this.kwota = kwota;
    }

    public void run()
    {
        konto.wplata(kwota);
    }
}
