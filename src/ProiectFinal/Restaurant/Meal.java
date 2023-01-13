package ProiectFinal.Restaurant;

public class Meal {
    public String mainDish;
    public String sideDish;
    public String drink;
    public boolean isHasToy;

    public Meal (mealBuilder buildMeal)
    {
        this.mainDish = buildMeal.mainDish;
        this.sideDish = buildMeal.sideDish;
        this.drink = buildMeal.drink;
        this.isHasToy = buildMeal.isHasToy;
    }
    public String getMainDish()
    {
        return this.mainDish;
    }

    public String getSideDish()
    {
        return this.sideDish;
    }

    public String getDrink()
    {
        return this.drink;
    }

    public boolean isHasToy()
    {
        return this.isHasToy;
    }

}
