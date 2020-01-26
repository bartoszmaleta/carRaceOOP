package app;

public class Motorcycle extends Vehicle {
    private static int nameNumber = 1;

    public Motorcycle() {
        normalSpeed = 100;
        name = "Motorcycle " + Integer.toString(nameNumber++);
    }

    @Override
    public boolean isBroken() {
        return false;
    }

    @Override
    public void moveForAnHour(Race race) {
        if (Weather.isRaining()) {
            int newSpeed = normalSpeed - Helpers.getRandomNumber(5, 50);
            if (race.isThereABrokenTruck()) {
                if (newSpeed >= 75) {
                    distanceTraveled += 75;
                } else {
                    distanceTraveled += newSpeed;
                }
            } else {
                distanceTraveled -= newSpeed;
            }
        } else {
            if (race.isThereABrokenTruck()) {
                distanceTraveled += 75;
            } else {
                distanceTraveled += normalSpeed;
            }
        }       
    }
}