package eu.chrost.java.modern.sealed.interfaces;

non-sealed class Train implements Movable {
    private int speed;

    @Override
    public int getSpeed() {
        return speed;
    }
}
