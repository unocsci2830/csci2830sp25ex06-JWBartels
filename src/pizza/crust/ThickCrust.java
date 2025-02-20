package pizza.crust;

public class ThickCrust extends PizzaCrust {
    private boolean isDeepDish;

    public ThickCrust() {
        this.isDeepDish = false;
    }

    @Override
    public String toString() {
        return "Thick Crust";
    }

    public void setDeepDish(boolean b) {
        this.isDeepDish = b;
    }
    public boolean getDeepDish() {
        return this.isDeepDish;
    }

    @Override
    public Double getPrice() {
        return 5.0;
    }
}
