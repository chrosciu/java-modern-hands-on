package eu.chrost.java.modern.sealed.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapeUtilsTest {
    @Test
    void testCircle() {
        var circle = new Circle(5);
        assertEquals("Circle with radius 5.0", ShapeUtils.describeShape(circle));
    }

    @Test
    void testRectangle() {
        var rectangle = new Rectangle(7, 8);
        assertEquals("Rectangle with dimensions 7.0x8.0", ShapeUtils.describeShape(rectangle));
    }

    @Test
    void testTriangle() {
        var triangle = new Triangle(3, 4);
        assertEquals("Triangle with base 3.0 and height 4.0", ShapeUtils.describeShape(triangle));
    }

    @Test
    void testNull() {
        assertEquals("Unknown shape", ShapeUtils.describeShape(null));
    }
}
