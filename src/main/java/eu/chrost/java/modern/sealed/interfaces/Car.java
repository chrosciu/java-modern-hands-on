package eu.chrost.java.modern.sealed.interfaces;

final class Car implements Movable {
    private int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    public void honk() {
        System.out.println("Car honking!");
    }
}
