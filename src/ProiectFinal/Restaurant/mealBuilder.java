package ProiectFinal.Restaurant;


public class mealBuilder
{
    public String mainDish;
    public String sideDish;
    public String drink;
    public boolean isHasToy;



    public mealBuilder buildMainDish (String mainDish)
        {
            this.mainDish = mainDish;
            return this;
        }
        public mealBuilder buildSideDish (String sideDish)
        {
            this.sideDish = sideDish;
            return this;
        }
        public mealBuilder buildDrink (String drink)
        {
            this.drink = drink;
            return this;
        }
        public mealBuilder buildHasToy (boolean isHasToy)
        {
            this.isHasToy = isHasToy;
            return this;
        }
        public Meal build()
        {
            if(this.mainDish == null )
            {
                throw new IllegalArgumentException("Main dish has not been set.");
            }
            else if (this.sideDish == null)
            {
                throw new IllegalArgumentException("Side dish has not been set.");
            }
            else if (this.drink == null)
            {
                throw new IllegalArgumentException("Drink has not been set.");
            }
            return new Meal(this);
        }


}
