package eu.chrost.java.modern.sealed.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BikeTest {

    @Test
    void testBikeGetSpeed() {
        Bike bike = new Bike(15);
        assertEquals(15, bike.getSpeed(), "Bike should return correct speed");
    }

    @Test
    void testBikeRingBell() {
        Bike bike = new Bike(10);
        bike.ringBell(); // Test sprawdza poprawne wywołanie metody
    }
}
