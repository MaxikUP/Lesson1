package Zadanie3;

public class Car {
    public String marka, model, color;
    public int distanceTraveled;
    public int masa;
    public boolean dtp;
    public int volumeTank;
    public Engine engine;

    public Car(String marka, String model, String color, int distanceTraveled, int masa, boolean dtp, int volumeTank, Engine engine) {
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
        Engine engine = new Engine(false, 1.8, 150, 0.6);
        Car auto1 = new Car("Scoda", "Octavia", "red", 56780, 1450, false, 50, engine);
        double l = auto1.distanceTraveled * engine.fuelСonsumption;
        System.out.println("БИИИИИП");
        System.out.println("Машина потратила " + l + " литра(ов) бензина.");
    }
}
