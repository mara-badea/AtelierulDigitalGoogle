package ProiectFinal.Promotion;

public class Main
{


    public static void main(String[] args) {
        Item item1 = new Item("Item1", 50.0, 2, 5);
        Item item2 = new Item("Item2", 100.0, 1, 10);
        Item item3 = new Item("Item3", 175.0, 11, 15);
        Item item4 = new Item("Item4", 200.0, 4, 20);

        PromotionHandler promotionHandler = new PromotionHandler();

        promotionHandler.applyPromotions(item1);
        System.out.println("Price after promotions: " + item1.getPrice());

        promotionHandler.applyPromotions(item2);
        System.out.println("Price after promotions: " + item2.getPrice());

        promotionHandler.applyPromotions(item3);
        System.out.println("Price after promotions: " + item3.getPrice());

        promotionHandler.applyPromotions(item4);
        System.out.println("Price after promotions: " + item4.getPrice());


    }
}
