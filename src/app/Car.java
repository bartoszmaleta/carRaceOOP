package app;

public class Car extends Vehicle {

    public Car() {
        this.normalnSpeed = Helpers.getRandomNumber(80, 110);
        this.name = Helpers.generateCarName();
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