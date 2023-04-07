import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CabrioTest {

    @Test
    void testStart() throws InterruptedException {
        Cabrio cabrio = new Cabrio("model", "manufacturer");
        cabrio.start();
        assertTrue(cabrio.isDriving);
    }

    @Test
    void testStartWhenDriving() throws InterruptedException {
        Cabrio cabrio = new Cabrio("model", "manufacturer");
        cabrio.isDriving = true;
        cabrio.start();
        assertFalse(cabrio.isDriving);
    }

    @Test
    void testStop() throws InterruptedException {
        Cabrio cabrio = new Cabrio("model", "manufacturer");
        cabrio.isDriving = true;
        cabrio.stop();
        assertFalse(cabrio.isDriving);
    }

    @Test
    void testStopWhenNotDriving() throws InterruptedException {
        Cabrio cabrio = new Cabrio("model", "manufacturer");
        cabrio.stop();
        assertFalse(cabrio.isDriving);
    }

    @Test
    void testOpenRoof() throws InterruptedException {
        Cabrio cabrio = new Cabrio("model", "manufacturer");
        cabrio.openRoof();
        assertTrue(cabrio.isRoofOpen());
    }

    @Test
    void testOpenRoofWhenDriving() throws InterruptedException {
        Cabrio cabrio = new Cabrio("model", "manufacturer");
        cabrio.isDriving = true;
        cabrio.openRoof();
        assertFalse(cabrio.isRoofOpen());
    }

    @Test
    void testCloseRoof() throws InterruptedException {
        Cabrio cabrio = new Cabrio("model", "manufacturer");
        cabrio.isRoofOpen = true;
        cabrio.closeRoof();
        assertFalse(cabrio.isRoofOpen());
    }

    @Test
    void testCloseRoofWhenNotOpen() throws InterruptedException {
        Cabrio cabrio = new Cabrio("model", "manufacturer");
        cabrio.closeRoof();
        assertFalse(cabrio.isRoofOpen);
    }
}