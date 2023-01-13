package ProiectFinal.Restaurant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Main
{


    public static void main(String[] args) {
        Meal meal = new mealBuilder()
                .buildMainDish("Hamburger")
                .buildSideDish("Fries")
                .buildDrink("Coke")
                .buildHasToy(true)
                .build();
        System.out.println("Main Dish : " + meal.getMainDish());
        System.out.println("Side Dish : " + meal.getSideDish());
        System.out.println("Drink : " + meal.getDrink());
        System.out.println("Has Toy : " + meal.isHasToy());
    }
}
