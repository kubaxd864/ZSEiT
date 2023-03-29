public class Calculator {
    private double odleglosc;
    public void CalculateCircle(Point a, Point S){

        odleglosc = Math.sqrt(Math.pow(a.getX() - S.getX(), 2) + Math.pow(a.getY() - S.getY(), 2));
        System.out.println("Wynik to: " + odleglosc);

//        if (odleglosc < circle.getR()) {
//            System.out.println("Punkt (" + a.getX() + ", " + a.getY() + ") leży wewnątrz okręgu o promieniu " + circle.getR());
//        } else if (odleglosc == circle.getR()) {
//            System.out.println("Punkt (" + a.getX() + ", " + a.getY() + ") leży na okręgu o promieniu " + circle.getR());
//        } else {
//            System.out.println("Punkt (" + a.getX() + ", " + a.getY() + ") leży poza okręgiem o promieniu " + circle.getR());
//        }


    }
}
