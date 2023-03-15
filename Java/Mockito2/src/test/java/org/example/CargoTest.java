package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CargoTest {

    @Mock
    private Cargo mockCargo;

    /**
     * Tests the {@link Cargo#getName() getName()} method of the {@link Cargo Cargo} class.
     * Defines the behavior of the {@link #mockCargo} mock object and asserts that the expected value is returned by the method.
     */
    @Test
    public void testGetName() {
        when(mockCargo.getName()).thenReturn("testName");
        assertEquals("testName", mockCargo.getName());
    }

    /**
     * Tests the {@link Cargo#getWeight() getWeight()} method of the {@link Cargo Cargo} class.
     * Defines the behavior of the {@link #mockCargo} mock object and asserts that the expected value is returned by the method.
     */
    @Test
    public void testGetWeight() {
        when(mockCargo.getWeight()).thenReturn(100);
        assertEquals(100, mockCargo.getWeight());
    }

    /**
     * Tests the {@link Cargo#equals(Object) equals(Object)} method of the {@link Cargo Cargo} class.
     * Creates three {@link Cargo} objects and asserts that the expected values are returned by the method.
     */
    @Test
    public void testEquals() {
        Cargo cargo1 = new Cargo("cargo1", 100);
        Cargo cargo2 = new Cargo("cargo1", 100);
        Cargo cargo3 = new Cargo("cargo3", 200);

        assertEquals(cargo1, cargo2);
        assertEquals(cargo2, cargo1);
        assertEquals(cargo1.hashCode(), cargo2.hashCode());

        assertEquals(false, cargo1.equals(cargo3));
        assertEquals(false, cargo3.equals(cargo1));
    }
}