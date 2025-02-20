package pizza.crust;

import pizza.MenuItem;

public abstract class PizzaCrust implements MenuItem {
    private String ingredient;

    public PizzaCrust() {
        this.ingredient = "";
    }

    public abstract String toString();

    public String toNiceString() {
        String build = "Crust: " + this.toString() + ". Crust Ingredient: " + this.ingredient + ". Price: $" + this.getPrice();
        if(getDeepDish()) {
            build += "\nDeep Dish Style";
        }
        return build;
    }

    public void setIngredient(String i) {
        this.ingredient = i;
    }

    public String getIngredient() {
        return this.ingredient;
    }

    public void setDeepDish(boolean b) {

    }

    public boolean getDeepDish() {
        return false;
    }

    public String checkIntegrity() {
        if(this.toString().equals("Thick Crust") && this.ingredient.equals("Cauliflower")) {
            return "Warning! Pizza might fall apart!";
        }
        return "";
    }


}
