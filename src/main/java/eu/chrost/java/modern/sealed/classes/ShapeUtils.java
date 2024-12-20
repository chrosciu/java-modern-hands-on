package eu.chrost.java.modern.sealed.classes;

class ShapeUtils {
    public static double totalArea(Shape shape) {
        return switch (shape) {
            case Circle c -> c.calculateArea();
            case Rectangle r -> r.calculateArea();
            case Triangle t -> t.calculateArea();
        };
    }
}
