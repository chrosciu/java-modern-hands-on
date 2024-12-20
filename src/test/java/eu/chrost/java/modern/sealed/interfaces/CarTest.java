package eu.chrost.java.modern.sealed.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {

    @Test
    void testCarGetSpeed() {
        Car car = new Car(120);
        assertEquals(120, car.getSpeed(), "Car should return correct speed");
    }

    @Test
    void testCarHonk() {
        Car car = new Car(90);
        car.honk(); // Sprawdzamy, czy metoda `honk` działa poprawnie (powinna wypisywać na konsolę)
    }

    @Test
    void testCarAccelerate() {
        Car car = new Car(60);
        car.accelerate(30); // Wywołanie metody domyślnej z interfejsu `Movable`
        // Metoda nie zmienia stanu klasy, ale powinna wypisać informację o przyspieszeniu na konsolę
    }
}
