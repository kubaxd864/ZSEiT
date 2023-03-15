package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UnitTest {

    private Unit unit;
    private Coordinates startCoordinates;
    private int maxFuel;
    private int maxCargoWeight;

    @Mock
    private Cargo mockCargo;

    /**
     * Initializes the Unit object with start coordinates, maximum fuel, and maximum cargo weight.
     * Initializes the mock object using MockitoAnnotations.initMocks().
     */
    @BeforeEach
    void setUp() {
        startCoordinates = new Coordinates(0, 0);
        maxFuel = 100;
        maxCargoWeight = 50;

        MockitoAnnotations.initMocks(this);

        unit = new Unit(startCoordinates, maxFuel, maxCargoWeight);
    }

    /**
     * Tests the constructor of the Unit class.
     * Ensures that it properly initializes the Unit object.
     */
    @Test
    void testConstructor() {
        assertNotNull(unit);
        assertEquals(startCoordinates, unit.getCoordinates());
        assertEquals(maxFuel, unit.getFuel());
        assertEquals(0, unit.getLoad());
        assertNotNull(unit.getCargo());
        assertTrue(unit.getCargo().isEmpty());
    }

    /**
     * Tests the move() method of the Unit class.
     * Ensures that it updates the coordinates and fuel level correctly.
     */
    @Test
    void testMove() {
        Coordinates newCoordinates = unit.move(10, 20);

        assertEquals(new Coordinates(10, 20), newCoordinates);
        assertEquals(maxFuel - 30, unit.getFuel());
    }

    /**
     * Tests the move() method of the Unit class.
     * Ensures that it throws an exception when the fuel level is not enough to complete the move.
     */
    @Test
    void testMoveNotEnoughFuel() {
        // Attempt to move the Unit object further than its remaining fuel allows
        assertThrows(IllegalStateException.class, () -> unit.move(100, 100));
    }

    @Test
    void testTankUp() {
        // Record the Unit object's fuel level before and after refueling
        int fuelBefore = unit.getFuel();
        unit.tankUp();
        int fuelAfter = unit.getFuel();

        // Check that the Unit object's fuel level has been increased by the correct amount
        assertTrue(fuelAfter >= fuelBefore);
        assertTrue(fuelAfter <= maxFuel);
    }

    @Test
    void testLoadCargo() {
        // Set up a mock Cargo object with a weight of 20
        int cargoWeight = 20;
        when(mockCargo.getWeight()).thenReturn(cargoWeight);

        // Load the mock Cargo object onto the Unit object
        unit.loadCargo(mockCargo);

        // Check that the Unit object's load has been updated correctly
        assertEquals(cargoWeight, unit.getLoad());

        // Check that the mock Cargo object has been added to the Unit object's cargo list
        assertFalse(unit.getCargo().isEmpty());
        assertTrue(unit.getCargo().contains(mockCargo));
    }

    @Test
    void testLoadCargoTooHeavy() {
        // Set up a mock Cargo object with a weight that exceeds the Unit object's maximum cargo weight
        int cargoWeight = maxCargoWeight + 1;
        when(mockCargo.getWeight()).thenReturn(cargoWeight);

        // Attempt to load the mock Cargo object onto the Unit object
        assertThrows(IllegalStateException.class, () -> unit.loadCargo(mockCargo));
    }

    @Test
    void testUnloadCargo() {
        unit.loadCargo(mockCargo);

        unit.unloadCargo(mockCargo);

        assertEquals(0, unit.getLoad());
        assertTrue(unit.getCargo().isEmpty());
    }

    @Test
    public void testUnloadAllCargo() {
        // Create a list of mock cargo objects
        List<Cargo> mockCargoList = new ArrayList<>();
        mockCargoList.add(mock(Cargo.class));
        mockCargoList.add(mock(Cargo.class));
        mockCargoList.add(mock(Cargo.class));

        // Set the weight of each mock cargo object using Mockito
        when(mockCargoList.get(0).getWeight()).thenReturn(10);
        when(mockCargoList.get(1).getWeight()).thenReturn(20);
        when(mockCargoList.get(2).getWeight()).thenReturn(30);

        // Unload all cargo from the unit
        unit.unloadAllCargo();

        // Assert that the unit's load is now zero
        assertEquals(0, unit.getLoad());

        // Assert that the unit's cargo list is now empty
        assertTrue(unit.getCargo().isEmpty());
    }
}