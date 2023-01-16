package ProiectFinal.Promotion;

public class AdditionalDiscount extends Promotion
{
    protected double discount;
    protected double overPrice;

    public AdditionalDiscount() {}

    public AdditionalDiscount(Promotion nextPromotion, String storeName, String description, int promotionId, double discount, double overPrice)
    {
        super(nextPromotion, storeName, description, promotionId);
        this.discount = discount;
        this.overPrice = overPrice;
    }


    @Override
    public boolean isEligible(Item item)
    {
        if(item.getPrice() >= overPrice)
        {
            return true;
        }
        else
            return false;
    }

    @Override
    public void applyPromotion(Item item)
    {
        if(isEligible(item))
        {

            item.setPrice(item.getPrice() * (1 - (discount / 100)));
        }
        else if(getNextPromotion() != null)
        {
            getNextPromotion().applyPromotion(item);
        }
    }
}
