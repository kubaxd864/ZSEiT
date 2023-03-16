package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.NoSuchElementException;
import java.util.Optional;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
class UnitServiceTest {
    /**
     * Test that addCargoByName method throws a NoSuchElementException when the requested cargo cannot be found.
     */
    @Test
    void addCargoByName_shouldThrowNoSuchElementException_whenCargoNotFound() {
        // given
        UnitService unitService = new UnitService();
        Unit unit = new Unit(new Coordinates(0, 0), 100, 100);
        CargoRepository cargoRepositoryMock = Mockito.mock(CargoRepository.class);
        when(cargoRepositoryMock.findCargoByName(anyString())).thenReturn(Optional.empty());
        unitService.cargoRepository = cargoRepositoryMock;
        // when
        NoSuchElementException exception = assertThrows(
                NoSuchElementException.class,
                () -> unitService.addCargoByName(unit, "Non-existent Cargo")
        );
        // then
        assertEquals("Unable to find cargo", exception.getMessage());
    }

    /**
     * Test that addCargoByName method loads cargo onto the unit when the requested cargo is found.
     */
    @Test
    void addCargoByName_shouldLoadCargo_whenCargoFound() {
        // given
        UnitService unitService = new UnitService();
        Unit unit = new Unit(new Coordinates(0, 0), 100, 100);
        Cargo cargo = new Cargo("Cargo", 50);
        CargoRepository cargoRepositoryMock = Mockito.mock(CargoRepository.class);
        when(cargoRepositoryMock.findCargoByName("Cargo")).thenReturn(Optional.of(cargo));
        unitService.cargoRepository = cargoRepositoryMock;
        // when
        unitService.addCargoByName(unit, "Cargo");
        // then
        assertEquals(1, unit.getCargo().size());
        assertEquals(cargo, unit.getCargo().get(0));
        assertEquals(50, unit.getLoad());
    }

    /**
     * Test that getUnitOn method throws a NoSuchElementException when no unit is found at the given coordinates.
     */
    @Test
    void getUnitOn_shouldThrowNoSuchElementException_whenUnitNotFound() {
        // given
        UnitService unitService = new UnitService();
        Coordinates coordinates = new Coordinates(0, 0);
        UnitRepository unitRepositoryMock = Mockito.mock(UnitRepository.class);
        when(unitRepositoryMock.getUnitByCoordinates(coordinates)).thenReturn(null);
        unitService.unitRepository = unitRepositoryMock;
        // when
        NoSuchElementException exception = assertThrows(
                NoSuchElementException.class,
                () -> unitService.getUnitOn(coordinates)
        );
        // then
        assertEquals("Unable to find any unit", exception.getMessage());
    }

    /**
     * Test that getUnitOn method returns the correct unit when a unit is found at the given coordinates.
     */
    @Test
    void getUnitOn_shouldReturnUnit_whenUnitFound() {
        // given
        UnitService unitService = new UnitService();
        Coordinates coordinates = new Coordinates(0, 0);
        Unit unit = new Unit(coordinates, 100, 100);
        UnitRepository unitRepositoryMock = Mockito.mock(UnitRepository.class);
        when(unitRepositoryMock.getUnitByCoordinates(coordinates)).thenReturn(unit);
        unitService.unitRepository = unitRepositoryMock;
        // when
        Unit result = unitService.getUnitOn(coordinates);
        // then
        assertEquals(unit, result);
    }
}