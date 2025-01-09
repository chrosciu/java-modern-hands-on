package eu.chrost.java.modern.sealed.classes;

abstract sealed class Shape permits Circle, Rectangle, Triangle {
    public abstract double calculateArea();
}
