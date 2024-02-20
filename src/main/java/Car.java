/**
 * Represents a car object with model, color, and speed attributes.
 */
public class Car {
    public static final int additionalSpeed = 10;
    public static final int limitSpeed = 120;
    /** The model of the car. */
    private String model;
    /** The color of the car. */
    private String color;
    /** The speed of the car. */
    private int speed;

    /**
     * Constructs a car object with the given model and color.
     *
     * @param model The model of the car.
     * @param color The color of the car.
     */
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    /**
     * Gets the speed of the car.
     *
     * @return The speed of the car.
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Gets the model of the car.
     *
     * @return The model of the car.
     */
    public String getModel(){
        return this.model;
    }

    /**
     * Gets the color of the car.
     *
     * @return The color of the car.
     */
    public String getColor(){
        return this.color;
    }

    /**
     * Sets the speed of the car.
     *
     * @param speed The speed to set.
     */
    public void setSpeed(int speed){
        this.speed = speed;
    }

    /**
     * Sets the model of the car.
     *
     * @param model The model to set.
     */
    public void setModel(String model){
        this.model = model;
    }

    /**
     * Sets the color of the car.
     *
     * @param color The color to set.
     */
    public void setColor(String color){
        this.color = color;
    }

    /**
     * Increases the speed of the car by 10, up to a maximum of 120.
     */
    public void accelerate() {
        int ExpectedSpeed = this.speed + additionalSpeed;

        if (ExpectedSpeed <= limitSpeed) {
            this.speed += additionalSpeed;
            displayDetails();
        } else {
            System.out.println("Maximum speed reached.");
        }
    }

    /**
     * Decreases the speed of the car by 10, stopping at 0.
     */
    public void decelerate() {
        int ExpectedSpeed = this.speed - additionalSpeed;

        if (ExpectedSpeed >= 0) {
            this.speed -= additionalSpeed;
            displayDetails();
        } else {
            System.out.println("The car is already stopped.");
        }
    }

    /**
     * Displays details of the car including model, color, and speed.
     */
    public void displayDetails() {
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Current speed: " + this.speed);
    }
}
