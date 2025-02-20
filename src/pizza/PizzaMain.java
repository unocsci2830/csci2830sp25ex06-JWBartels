package pizza;

import java.util.Scanner;

public class PizzaMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What type of crust would you like?");
        System.out.println("1 - Thin Crust");
        System.out.println("2 - Thick Crust");
        System.out.print("Your choice: ");
        int inputCrust = scan.nextInt();

        String inputDeepDish = "N";
        if(inputCrust == 2) {
            System.out.println("Would you like deep dish? (Y/N)");
            System.out.print("Your choice: ");
            inputDeepDish = scan.next();
        }

        System.out.println("What ingredient would you like your crust made out of?");
        System.out.println("1 - Flour Crust");
        System.out.println("2 - Cauliflower Crust");
        System.out.print("Your choice: ");
        int inputCrustIngredient = scan.nextInt();

        System.out.println("What type of sauce would you like?");
        System.out.println("1 - Tomato Sauce");
        System.out.println("2 - Alfredo Sauce");
        System.out.print("Your choice: ");
        int inputSauce = scan.nextInt();

        System.out.print("How many toppings (0-4): ");
        int numberOfToppings = scan.nextInt();
        System.out.println("Topping List: ");
        System.out.println("1 - Cheddar");
        System.out.println("2 - Mozzarella");
        System.out.println("3 - Provolone");
        System.out.println("4 - Parmesan");
        System.out.println("5 - Hamburger");
        System.out.println("6 - Pepperoni");
        System.out.println("7 - Canadian Bacon");
        System.out.println("8 - Sausage");
        System.out.println("9 - Bell Pepper");
        System.out.println("10 - Onion");
        System.out.println("11 - Mushroom");
        System.out.println("12 - Tomato");
        int[] inputToppings = {0,0,0,0};
        String[] orderLabel = {"1st", "2nd", "3rd", "4th"};
        for(int i = 0; i < numberOfToppings; i++) {
            System.out.print(orderLabel[i] + " topping choice: ");
            inputToppings[i] = scan.nextInt();
        }

        Pizza userPizza = new Pizza(inputCrust, inputSauce, inputToppings, inputCrustIngredient, inputDeepDish);
        System.out.println();
        userPizza.printPizza();

        System.out.println(userPizza.getCrust().checkIntegrity());
    }
}
