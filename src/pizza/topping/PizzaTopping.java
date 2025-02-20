package pizza.topping;

import pizza.MenuItem;

public abstract class PizzaTopping implements MenuItem {
    public abstract String toString();

    public String toNiceString() {
        return "Topping: " + this.toString() + ". Price: $" + this.getPrice();
    }

    @Override
    public Double getPrice() {
        return 0.5;
    }
}
