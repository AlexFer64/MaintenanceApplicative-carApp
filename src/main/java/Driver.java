/**
 * Represents a driver who can operate a car.
 */
public class Driver {
    /** The legal age for driving. */
    public static final int LEGAL_DRIVING_AGE = 18;

    /** The name of the driver. */
    private String name;
    /** The age of the driver. */
    private int age;

    /**
     * Constructs a driver object with the given name and age.
     *
     * @param name The name of the driver.
     * @param age The age of the driver.
     */
    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Checks if the driver is considered an adult based on the legal driving age.
     *
     * @return True if the driver is an adult, false otherwise.
     */
    public boolean isAdult() {
        return (this.age >= LEGAL_DRIVING_AGE);
    }

    /**
     * Starts the car if the driver is considered an adult.
     * Otherwise, displays a message indicating that the driver is not old enough to drive.
     */
    public void startCar() {
        if (isAdult()) {
            System.out.println(name + " starts the car.");
        } else {
            System.out.println("The driver is not old enough to drive.");
        }
    }

    /**
     * Stops the car.
     */
    public void stopCar() {
        System.out.println(name + " stops the car.");
    }

    /**
     * Changes the speed of the given car and displays a message indicating the action.
     *
     * @param car The car whose speed will be changed.
     * @param newSpeed The new speed to set for the car.
     */
    public void changeSpeed(Car car, int newSpeed) {
        System.out.println(name + " changes the speed of the car to " + newSpeed);
        car.accelerate();
    }
}
