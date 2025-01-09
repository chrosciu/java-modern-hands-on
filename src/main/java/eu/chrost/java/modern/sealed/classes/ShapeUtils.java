package eu.chrost.java.modern.sealed.classes;

class ShapeUtils {
    public static String describeShape(Shape shape) {
        return switch (shape) {
            case null -> "Unknown shape";
            case Circle c -> "Circle with radius " + c.getRadius();
            case Rectangle r -> "Rectangle with dimensions " + r.getWidth() + "x" + r.getHeight();
            case Triangle t -> "Triangle with base " + t.getBase() + " and height " + t.getHeight();
        };
    }
}
