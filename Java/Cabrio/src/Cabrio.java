public class Cabrio {
    boolean isRoofOpen;
    boolean isDriving;

    public Cabrio(String model, String manufacturer) {
        isRoofOpen = false;
        isDriving = false;
    }

    public void start() throws InterruptedException{
        if (!isDriving) {
            System.out.println("Uruchamianie Silnika...");
            Thread.sleep(1000);
            System.out.println("Samochód Jest W Ruchu ");
            isDriving = true;
        }
        else {
            System.out.println("Samochód Jest Już W Ruchu");
        }
    }

    public void stop() throws InterruptedException{
        if (isDriving) {
            System.out.println("Wyłączanie Silnika...");
            Thread.sleep(1000);
            System.out.println("Samochód Się Zatrzymał");
            isDriving = false;
        }
        else {
            System.out.println("Samochód Już Stoi");
        }
    }

    public void openRoof() throws InterruptedException {
        if (isDriving) {
            System.out.println("Nie Można Otworzyć Dachu W Trakcie Jazdy");
        }
        else if (!isRoofOpen) {
            System.out.println("Otwieranie Dachu...");
            Thread.sleep(7000);
            System.out.println("Dach Jest Otwarty");
            isRoofOpen = true;
        }
        else {
            System.out.println("Dach Jest Już Otwarty");
        }
    }

    public void closeRoof() throws InterruptedException {
        if (isDriving) {
            System.out.println("Nie Można Złożyć Dachu W Trakcie Jazdy");
        }
        else if (!isRoofOpen) {
            System.out.println("Dach Jest Już Zamknięty");
        } else {
            System.out.println("Zamykanie dachu...");
            Thread.sleep(5000);
            System.out.println("Zamknięto dach");
            isRoofOpen = false;
        }
    }

    public boolean isRoofOpen() {
        return isRoofOpen;
    }
}
