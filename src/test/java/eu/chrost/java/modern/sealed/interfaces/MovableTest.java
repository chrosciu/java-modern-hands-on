package eu.chrost.java.modern.sealed.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovableTest {

    @Test
    void testDefaultAccelerate() {
        Movable bike = new Bike(10);
        bike.accelerate(5); // Sprawdzamy, czy metoda domyślna jest poprawnie wywoływana

        Movable train = new Train();
        train.accelerate(10); // Sprawdzamy, czy metoda działa również dla innych implementacji
    }

    @Test
    void testSealedInterfaceRestrictions() {
        // Próba użycia klasy spoza `Car`, `Bike`, `Train` powinna zostać zablokowana przez kompilator
        // Movable invalid = new InvalidClass(); // ERROR: not permitted by Movable
    }
}
