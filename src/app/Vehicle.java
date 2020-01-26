package app;

public abstract class Vehicle {
    int normalSpeed;
    protected String name;
    int distanceTraveled = 0;

    public String getName() {
        return name;
    }
    
    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public abstract boolean isBroken();

    // public abstract void moveForAnHour(Race race);
}