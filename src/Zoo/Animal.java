package Zoo;

public abstract class Animal {
    public String name;
    protected int hungry;

    public Animal(String name, int hungry) {
        this.name = name;
        this.hungry = hungry;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHungry() {

        return hungry;
    }

    public void setHungry(int hungry) {

        this.hungry = hungry;
    }
}
