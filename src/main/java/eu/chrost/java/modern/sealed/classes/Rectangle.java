package eu.chrost.java.modern.sealed.classes;

final class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        if (width <= 0 || height <= 0) throw new IllegalArgumentException("Dimensions must be > 0");
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
