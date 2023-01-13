package ProiectFinal.Restaurant;

import java.net.http.WebSocket;

public class mealBuilder
{
    public String mainDish;
    public String sideDish;
    public String drink;
    public boolean hasToy;
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
        public mealBuilder buildHasToy (boolean hasToy)
        {
            this.hasToy = hasToy;
            return this;
        }
}
