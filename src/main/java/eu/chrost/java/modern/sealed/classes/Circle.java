package eu.chrost.java.modern.sealed.classes;

final class Circle extends Shape {
    private final double radius;

    public Circle(String name, double radius) {
        super(name);
        if (radius <= 0) throw new IllegalArgumentException("Radius must be > 0");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
