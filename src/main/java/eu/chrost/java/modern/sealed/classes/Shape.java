package eu.chrost.java.modern.sealed.classes;

import java.awt.*;

abstract sealed class Shape permits Circle, Rectangle, Triangle {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getDescription() {
        return "Shape: " + name;
    }

    public abstract double calculateArea();
}
