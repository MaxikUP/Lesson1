package Zadanie3;

public class Car {

    public String marka, model, color, engine;
    public int distanceTraveled;
    public int masa;
    public boolean dtp;
    public int volumeTank;

    public Car(String marka, String model, String color, int distanceTraveled, int masa, boolean dtp, int volumeTank, String engine) {
        this.marka = marka;
        this.model = model;
        this.color = color;
        this.distanceTraveled = distanceTraveled;
        this.masa = masa;
        this.dtp = dtp;
        this.volumeTank = volumeTank;
        this.engine = engine;
    }
    public static void main(String[] args) {
        Car auto1 = new Car("Scoda", "Octavia", "red", 56780, 1450, false, 50,"Dvigatel1");
        Engine Dvigatel1 = new Engine(false, 1.8, 150, 0.6);
        double l = auto1.distanceTraveled * Dvigatel1.fuelСonsumption;
        System.out.println("БИИИИИП");
        System.out.print("Машина проехала " + auto1.distanceTraveled + " км. и прои этом потратила " + l + " литра(ов) бензина.");
    }
}
