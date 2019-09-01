package Zoo;

public abstract class Predatory extends Animal {
    public boolean predat;


    public Predatory(String name, int hungry, boolean predat) {
        super(name, hungry);
        this.predat = predat;
    }

    public boolean gatPredat() {
        return predat;
    }

    public void setPredat(boolean predat) {
        this.predat = predat;
    }
}
