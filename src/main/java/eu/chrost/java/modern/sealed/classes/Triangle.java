package eu.chrost.java.modern.sealed.classes;

non-sealed class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        if (base < 0 || height < 0) throw new IllegalArgumentException("Dimensions must be > 0");
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }
}
