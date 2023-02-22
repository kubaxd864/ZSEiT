import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTests {

    private Unit unit;

    @BeforeEach
    void setUp() {
        Coordinates startCoordinates = new Coordinates(0, 0);
        int maxFuel = 100;
        int maxCargoWeight = 50;
        unit = new Unit(startCoordinates, maxFuel, maxCargoWeight);
    }

    @Test
    void shouldTankUp() {
//        Metoda testująca metodę tankUp() klasy Unit. Sprawdza, czy po zatankowaniu jednostki wartość jej paliwa jest większa niż 0 oraz mniejsza lub równa maksymalnej ilości paliwa jednostki.
        unit.tankUp();

        assertTrue(unit.getFuel() > 0);
        assertTrue(unit.getFuel() <= unit.getFuel());
    }

    @Test
    void shouldThrowException() {
//        Metoda testująca metodę move() klasy Unit w sytuacji, gdy jednostka nie ma wystarczającej ilości paliwa, aby pokonać dany dystans. Sprawdza, czy po wykonaniu metody move() zostanie rzucony wyjątek IllegalStateException.
        assertThrows(IllegalStateException.class, () -> unit.move(50, 50));
    }

    @Test
    void shouldLoad() {
//        Metoda testująca metodę loadCargo() klasy Unit. Sprawdza, czy po załadowaniu ładunku w jednostce wartość jej obciążenia jest równa wadze załadowanego ładunku oraz czy metoda getLoad() zwraca poprawną wartość.
        Cargo cargo = new Cargo("Test Cargo", 10);

        unit.loadCargo(cargo);

        assertTrue(unit.getLoad() == cargo.getWeight());
        assertEquals(cargo.getWeight(), unit.getLoad());
    }


    @Test
    void shouldUnload() {
//        Metoda testująca metodę unloadCargo() klasy Unit. Sprawdza, czy po wyładowaniu ładunku z jednostki wartość jej obciążenia zmniejsza się o wagę wyładowanego ładunku oraz czy metoda getLoad() zwraca poprawną wartość.
        Cargo cargo = new Cargo("Cargo", 10);
        unit.loadCargo(cargo);

        unit.unloadCargo(cargo);

        assertFalse(unit.getLoad() == cargo.getWeight());
        assertEquals(0, unit.getLoad());
    }

    @Test
    void shouldUnloadAll() {
//        Metoda testująca metodę unloadAllCargo() klasy Unit. Sprawdza, czy po wyładowaniu wszystkich ładunków z jednostki jej wartość obciążenia wynosi 0 oraz czy metoda getLoad() zwraca poprawną wartość.
        Cargo cargo1 = new Cargo("Cargo1", 10);
        Cargo cargo2 = new Cargo("Cargo2", 20);
        unit.loadCargo(cargo1);
        unit.loadCargo(cargo2);

        unit.unloadAllCargo();

        assertTrue(unit.getLoad() == 0);
        assertEquals(0, unit.getLoad());
    }
}