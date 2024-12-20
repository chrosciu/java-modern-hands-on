package eu.chrost.java.modern.sealed.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapeUtilsTest {

    @Test
    void testTotalArea() {
        Shape circle = new Circle("Circle1", 5);

        double total = ShapeUtils.totalArea(circle);
        assertEquals(Math.PI * 25, total, 0.01);
    }
}
