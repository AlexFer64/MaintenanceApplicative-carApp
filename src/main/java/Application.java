public class Application {
    public static void main(String[] args) {

        //Create a new car.
        Car myCar = new Car("Sedan", "Bleu");

        //Create a driver.
        Driver myDriver = new Driver("John", 20);

        myDriver.startCar();
        myCar.accelerate();
        myDriver.changeSpeed(myCar, 80);
        myCar.decelerate();
        myDriver.stopCar();
        myCar.displayDetails();
    }
}