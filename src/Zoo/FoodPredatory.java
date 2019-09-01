package Zoo;

public abstract class FoodPredatory extends Food {
    public boolean foodPred;

    public FoodPredatory(String name, int sustenance, boolean foodPred) {
        super(name, sustenance);
        this.foodPred = foodPred;
    }
}
