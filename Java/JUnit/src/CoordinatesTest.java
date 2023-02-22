import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoordinatesTest {


    @Test
    public void testCoordinatesGreater100() {
        // wartości x i y ustawione są na 50 i 101, odpowiednio, a następnie wywołana jest metoda assertThrows z oczekiwanym wyjątkiem IllegalArgumentException i konstruktorem klasy Coordinates jako argumentem.
        int x = 50;
        int y = 101;
        assertThrows(IllegalArgumentException.class, () -> new Coordinates(x, y));
    }

    @Test
    public void testValid() {
        // wartości x i y ustawione są na 80 i 90, odpowiednio, a następnie tworzony jest obiekt klasy Coordinates z tymi wartościami. Następnie porównywane są wartości x i y obiektu z wartościami x i y, które zostały podane do konstruktora.
        int x = 80;
        int y = 90;
        Coordinates coordinates = new Coordinates(x, y);
        assertEquals(x, coordinates.getX());
        assertEquals(y, coordinates.getY());
    }

    @Test
    public void testNotEquals() {
        // tworzone są dwa obiekty klasy Coordinates z różnymi wartościami x i y. Następnie wywoływana jest metoda equals na pierwszym obiekcie z drugim obiektem jako argumentem, a oczekiwana wartość wyniku jest ustawiona na false.
        Coordinates coordinates1 = new Coordinates(70, 80);
        Coordinates coordinates2 = new Coordinates(20, 50);
        assertFalse(coordinates1.equals(coordinates2));
    }

    @Test
    public void testNegative() {
        // wartości x i y ustawione są na -7 i 50, odpowiednio, a następnie wywołana jest metoda assertThrows z oczekiwanym wyjątkiem IllegalArgumentException i konstruktorem klasy Coordinates jako argumentem.
        int x = -7;
        int y = 50;
        assertThrows(IllegalArgumentException.class, () -> new Coordinates(x, y));
    }

    @Test
    public void testEquals() {
        // tworzone są dwa identyczne obiekty klasy Coordinates, a następnie wywoływana jest metoda equals na pierwszym obiekcie z drugim obiektem jako argumentem, a oczekiwana wartość wyniku jest ustawiona na true.
        Coordinates coordinates1 = new Coordinates(60, 90);
        Coordinates coordinates2 = new Coordinates(60, 90);
        assertTrue(coordinates1.equals(coordinates2));
    }

    @Test
    public void testCopy() {
        // tworzony jest obiekt klasy Coordinates o wartościach x i y równe 8 i 20, odpowiednio. Następnie tworzone są wartości x i y równe 90 i -6, odpowiednio, a metoda copy jest wywoływana na obiekcie klasy Coordinates z wartościami x i y jako argumentami. Następnie porównywane są wartości x i y nowego obiektu z wartościami x i y oryginalnego obiektu powiększonymi o wartości x i y, które zostały podane jako argumenty do metody copy.
        Coordinates originalCoordinates = new Coordinates(8, 20);
        int x = 90;
        int y = -6;
        Coordinates newCoordinates = Coordinates.copy(originalCoordinates, x, y);
        assertEquals(originalCoordinates.getX() + x, newCoordinates.getX());
        assertEquals(originalCoordinates.getY() + y, newCoordinates.getY());
    }

}