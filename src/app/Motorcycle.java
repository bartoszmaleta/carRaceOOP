package app;

public class Motorcycle extends Vehicle {
    private static int nameNumber = 1;

    public Motorcycle() {
        normalnSpeed = 100;
        name = "Motorcycle " + Integer.toString(nameNumber++);
    }

    @Override
    public boolean isBroken() {
        return false;
    }

    // @Override
    // public void moveForAnHour(Race race) {
        // 
    // }
}