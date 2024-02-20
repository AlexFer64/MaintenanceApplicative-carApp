public class Application {
    public static void main(String[] args) {
        Car myCar = new Car("Sedan", "Bleu");
        Driver moi = new Driver("John", 20);

        moi.startCar();
        myCar.accelerate();
        moi.changeSpeed(myCar, 80);
        myCar.decelerate();
        moi.stopCar();
        myCar.displayDetails();
    }
}