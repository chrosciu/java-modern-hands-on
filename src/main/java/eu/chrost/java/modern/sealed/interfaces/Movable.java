package eu.chrost.java.modern.sealed.interfaces;

sealed interface Movable permits Car, Bike, Train {
    int getSpeed();
    default void accelerate(int delta) {
        System.out.println("Accelerating by " + delta);
    }
}
