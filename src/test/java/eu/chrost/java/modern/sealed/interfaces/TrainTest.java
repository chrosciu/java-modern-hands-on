package eu.chrost.java.modern.sealed.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrainTest {

    @Test
    void testTrainGetSpeed() {
        Train train = new Train();
        assertEquals(0, train.getSpeed(), "Train should return default speed as 0");
    }

    @Test
    void testTrainAccelerate() {
        Train train = new Train();
        train.accelerate(20); // Testuje domyślną metodę przyspieszenia
    }
}
