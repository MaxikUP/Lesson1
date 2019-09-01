package Zoo;

public abstract class Food {
    public String name;
    protected int sustenance;

    public Food(String name, int sustenance) {
        this.name = name;
        this.sustenance = sustenance;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getSustenance() {
        return sustenance;
    }

    public void setSustenance(int sustenance) {
        this.sustenance = sustenance;
    }

}

