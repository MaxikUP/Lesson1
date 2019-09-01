package Zoo;

public abstract class Herbivorous extends Animal {
    public boolean herbivor;


    public Herbivorous(String name, int hungry, boolean herbivor) {
        super(name, hungry);
        this.herbivor = herbivor;
    }

    public boolean getHerbivor() {
        return herbivor;
    }

    public void setHerbivor(boolean herbivor) {
        this.herbivor = herbivor;
    }
}
