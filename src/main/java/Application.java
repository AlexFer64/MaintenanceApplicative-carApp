public class Application {
    public static void main(String[] args) {
        Car myCar = new Car("Sedan", "Bleu");
        Conducteur moi = new Conducteur("John", 20);

        moi.demarrerVoiture(myCar);
        myCar.accelerate();
        moi.changerVitesse(myCar, 80);
        myCar.decelerate();
        moi.arreterVoiture(myCar);
        myCar.displayDetails();
    }
}