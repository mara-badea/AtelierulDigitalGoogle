
package ProiectFinal.Promotion;

public class FreeShipping extends Promotion
{
    protected double overFreeShippingPrice;

    public FreeShipping() {}

    public FreeShipping(Promotion nextPromotion, String storeName, String description, int promotionId, double overFreeShippingPrice)
    {
        super(nextPromotion, storeName, description, promotionId);
        this.overFreeShippingPrice = overFreeShippingPrice;
    }


    @Override
    public boolean isEligible(Item item)
    {
        if(item.getPrice()>=overFreeShippingPrice)
        {
            return true;
        }
        else
            return false;
    }

    @Override
    public void applyPromotion(Item item) {
        if (isEligible(item))
        {
            item.setPrice(item.getPrice() - item.getShippingCost());
        }
        else if (getNextPromotion() != null) {
            getNextPromotion().applyPromotion(item);
        }
    }
}
