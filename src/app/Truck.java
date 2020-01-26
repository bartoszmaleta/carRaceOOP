package app;

public class Truck extends Vehicle {
    private int breakdownTurnsLeft = 0;

    Truck() {
        normalSpeed = 100;
        name = Integer.toString(Helpers.getRandomNumber(0, 1000));
    }

    @Override
    public boolean isBroken() {
        return breakdownTurnsLeft != 0;
    }

    @Override
    public void moveForAnHour(Race race) {
        if (breakdownTurnsLeft == 0) {
            if (Helpers.probability(5)) breakdownTurnsLeft = 2;
            else {
                if (race.isThereABrokenTruck()) distanceTraveled += 75;
                else distanceTraveled += normalSpeed;
            }
        } else {
            breakdownTurnsLeft--;
        }
    }
}