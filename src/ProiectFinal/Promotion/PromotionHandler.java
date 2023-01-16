package ProiectFinal.Promotion;

public class PromotionHandler implements Handler {
    protected Promotion firstPromotion;

    public PromotionHandler()
    {
        Promotion buyOneGetOneFree = new BuyOneGetOneFree(null, "Zara", "Pentru multiplu de 2 articole platesti doar jumatate din ele", 1);
        Promotion additionalDiscount = new AdditionalDiscount(buyOneGetOneFree, "Stradivarius", "15% reducere la un cos de peste 20 ron", 2, 15, 20);
        Promotion freeShipping = new FreeShipping(additionalDiscount, "Bershka", "Livrare grauita online la un cos in valoare de peste 30 ron", 3, 30);
        this.firstPromotion = freeShipping;
    }
@Override
    public void applyPromotions(Item item) {
        item.setPrice(item.getQuantity()* item.getPrice());
        Promotion currentPromotion = firstPromotion;
        while (currentPromotion != null) {
            if (currentPromotion.isEligible(item))
            {
                currentPromotion.applyPromotion(item);
            }
            currentPromotion = currentPromotion.getNextPromotion();
        }
    }
}