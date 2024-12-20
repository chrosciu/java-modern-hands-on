package eu.chrost.java.modern.sealed.interfaces;

final class Bike implements Movable {
    private int speed;

    public Bike(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    public void ringBell() {
        System.out.println("Bike ringing bell!");
    }
}
