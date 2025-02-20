package pizza;
import java.util.ArrayList;
import pizza.topping.*;
import pizza.sauce.*;
import pizza.crust.*;


public class Pizza implements MenuItem{
    private PizzaCrust crust;
    private PizzaSauce sauce;
    private ArrayList<PizzaTopping> toppings;
    private ArrayList<MenuItem> selectionList;

    public Pizza(int c, int s, int[] t, int ingredient, String d) {
        this.crust = (c == 2) ? new ThickCrust() : new ThinCrust();
        if(ingredient == 2) {
            this.crust.setIngredient("Cauliflower");
        } else {
            this.crust.setIngredient("Flour");
        }
        this.sauce = (s == 2) ? new AlfredoSauce() : new TomatoSauce();
        this.toppings = new ArrayList<PizzaTopping>();
        for(int i = 0; i < t.length; i++) {
            switch (t[i]) {
                case 1:
                    this.toppings.add(new CheddarTopping());
                    break;
                case 2:
                    this.toppings.add(new MozzarellaTopping());
                    break;
                case 3:
                    this.toppings.add(new ProvoloneTopping());
                    break;
                case 4:
                    this.toppings.add(new ParmesanTopping());
                    break;
                case 5:
                    this.toppings.add(new HamburgerTopping());
                    break;
                case 6:
                    this.toppings.add(new PepperoniTopping());
                    break;
                case 7:
                    this.toppings.add(new CanadianBaconTopping());
                    break;
                case 8:
                    this.toppings.add(new SausageTopping());
                    break;
                case 9:
                    this.toppings.add(new BellPepperTopping());
                    break;
                case 10:
                    this.toppings.add(new OnionTopping());
                    break;
                case 11:
                    this.toppings.add(new MushroomTopping());
                    break;
                case 12:
                    this.toppings.add(new TomatoTopping());
                    break;
                default:
                    break;
            }
        }
        if((d.equals("Y") || d.equals("y")) && c == 2) {
            this.crust.setDeepDish(true);
        }
        this.selectionList = new ArrayList<MenuItem>();
        this.selectionList.add(this.crust);
        this.selectionList.add(this.sauce);
        selectionList.addAll(this.toppings);
    }

    public void printPizza() {
        System.out.println("Pizza consists of: ");
        System.out.println(this.crust.toNiceString());
        System.out.println(this.sauce.toNiceString());
        for(PizzaTopping t : this.toppings) {
            System.out.println(t.toNiceString());
        }
        System.out.println("Price: $" + this.getPrice());
    }

    public PizzaCrust getCrust() {
        return this.crust;
    }

    @Override
    public Double getPrice() {
        Double total = 0.0;
        for(MenuItem m : this.selectionList) {
            total += m.getPrice();
        }
        return total;
    }
}
