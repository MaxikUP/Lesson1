package Zoo;

public abstract class FoodHerbivorous extends Food {
    public boolean foodHerb;

    public FoodHerbivorous(String name, int sustenance, boolean foodHerb) {
        super(name, sustenance);
        this.foodHerb = foodHerb;
    }
}
