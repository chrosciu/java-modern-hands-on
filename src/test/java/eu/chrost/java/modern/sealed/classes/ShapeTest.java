package eu.chrost.java.modern.sealed.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapeTest {

    @Test
    void testCircleArea() {
        Circle circle = new Circle("Circle", 2);
        assertEquals(4 * Math.PI, circle.calculateArea());
    }

    @Test
    void testRectangleArea() {
        Rectangle rectangle = new Rectangle("Rectangle", 3, 4);
        assertEquals(12, rectangle.calculateArea());
    }

    @Test
    void testTriangleArea() {
        Triangle triangle = new Triangle("Triangle", 3, 2);
        assertEquals(3, triangle.calculateArea());
    }
}
