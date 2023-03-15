package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Optional;
import static org.mockito.Mockito.*;

public class CargoRepositoryTest {

    private CargoRepository cargoRepository;

    @Mock
    private Cargo cargoMock;

    /**
     * Sets up the test environment by initializing the {@link MockitoAnnotations} and creating a new {@link CargoRepository} object.
     */
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        cargoRepository = new CargoRepository();
    }

    /**
     * Tests the {@link CargoRepository#addCargo(Cargo) addCargo(Cargo)} method of the {@link CargoRepository} class.
     * Adds a mock {@link Cargo} object to the repository and asserts that the expected value is returned by the method.
     */
    @Test
    public void testAddCargo() {
        cargoRepository.addCargo(cargoMock);
        Assertions.assertEquals(1, cargoRepository.cargoList.size());
        Assertions.assertTrue(cargoRepository.cargoList.contains(cargoMock));
    }

    /**
     * Tests the {@link CargoRepository#removeCargo(Cargo) removeCargo(Cargo)} method of the {@link CargoRepository} class.
     * Adds a mock {@link Cargo} object to the repository, removes it and asserts that the expected value is returned by the method.
     */
    @Test
    public void testRemoveCargo() {
        cargoRepository.addCargo(cargoMock);
        cargoRepository.removeCargo(cargoMock);
        Assertions.assertEquals(0, cargoRepository.cargoList.size());
        Assertions.assertFalse(cargoRepository.cargoList.contains(cargoMock));
    }

    /**
     * Tests the {@link CargoRepository#findCargoByName(String) findCargoByName(String)} method of the {@link CargoRepository} class.
     * Adds two {@link Cargo} objects to the repository and searches for one of them by name.
     * Asserts that the expected value is returned by the method and that the method returns {@link Optional#empty() empty()} for a non-existent cargo.
     */
    @Test
    public void testFindCargoByName() {
        Cargo cargo1 = new Cargo("Cargo1", 200);
        Cargo cargo2 = new Cargo("Cargo2", 300);
        cargoRepository.addCargo(cargo1);
        cargoRepository.addCargo(cargo2);

        Optional<Cargo> result = cargoRepository.findCargoByName("Cargo1");
        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals(cargo1, result.get());

        result = cargoRepository.findCargoByName("Cargo3");
        Assertions.assertFalse(result.isPresent());
    }
}