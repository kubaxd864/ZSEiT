package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoordinatesTest {

    /**
     * Tests that the Coordinates class constructor correctly initializes
     * the x and y fields.
     */
    @Test
    public void testConstructor() {
        Coordinates coordinates = new Coordinates(50, 60);
        Assertions.assertEquals(50, coordinates.getX());
        Assertions.assertEquals(60, coordinates.getY());
    }

    /**
     * Tests that the copy() method correctly creates a new instance of Coordinates
     * with updated values.
     */
    @Test
    public void testCopy() {
        Coordinates coordinates1 = new Coordinates(50, 60);
        Coordinates coordinates2 = Coordinates.copy(coordinates1, 10, 20);

        Assertions.assertEquals(60, coordinates2.getX());
        Assertions.assertEquals(80, coordinates2.getY());
    }

    /**
     * Tests that the Coordinates class constructor throws an IllegalArgumentException
     * when given invalid input values.
     */
    @Test
    public void testConstructorWithInvalidValues() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Coordinates(-1, 50));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Coordinates(50, -1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Coordinates(101, 50));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Coordinates(50, 101));
    }

    /**
     * Tests that the equals() and hashCode() methods correctly compare the values
     * of two Coordinates objects.
     */
    @Test
    public void testEqualsAndHashCode() {
        Coordinates coordinates1 = new Coordinates(50, 60);
        Coordinates coordinates2 = new Coordinates(50, 60);
        Coordinates coordinates3 = new Coordinates(60, 70);
        Assertions.assertEquals(coordinates1, coordinates2);
        Assertions.assertEquals(coordinates1.hashCode(), coordinates2.hashCode());
        Assertions.assertNotEquals(coordinates1, coordinates3);
        Assertions.assertNotEquals(coordinates1.hashCode(), coordinates3.hashCode());
    }
}