public class Calculator {
    private double odleglosc;
    private double AB;
    private double BC;
    private double Pole;
    public void CalculateCircle(Point a, Point S){

        odleglosc = Math.sqrt(Math.pow(a.getX() - S.getX(), 2) + Math.pow(a.getY() - S.getY(), 2));

        if (odleglosc < Circle.getR()) {
            System.out.println("Punkt (" + a.getX() + ", " + a.getY() + ") leży wewnątrz okręgu o promieniu " + Circle.getR());
        } else if (odleglosc == Circle.getR()) {
            System.out.println("Punkt (" + a.getX() + ", " + a.getY() + ") leży na okręgu o promieniu " + Circle.getR());
        } else {
            System.out.println("Punkt (" + a.getX() + ", " + a.getY() + ") leży poza okręgiem o promieniu " + Circle.getR());
        }
    }

    public void CalculateRectangle(Point a, Point b, Point c){

        AB = Math.sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
        BC = Math.sqrt(Math.pow((c.getX() - b.getX()), 2) + Math.pow((c.getY() - b.getY()), 2));
        Pole = BC * AB;
        System.out.println("Pole Danego Prostokąta wynosi: " + Pole);

    }
}
