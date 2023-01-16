package ProiectFinal.Promotion;

public class BuyOneGetOneFree extends Promotion
{

    public BuyOneGetOneFree(Promotion nextPromotion, String storeName, String description, int promotionId)
    {
        super(nextPromotion, storeName, description, promotionId);
    }

    public BuyOneGetOneFree() {
    }

    @Override
    public boolean isEligible(Item item)
    {
        if(item.getQuantity() > 1 )
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
            if(item.getQuantity() % 2 == 1)
            {
                item.setPrice(  (item.getPrice() - (item.getPrice()  / item.getQuantity() ) ) / 2 + item.getPrice() / item.getQuantity() );
            }
            else
            {
                item.setPrice(item.getPrice() / 2);
            }
        }
        else if(getNextPromotion() != null)
        {
            getNextPromotion().applyPromotion(item);
        }
    }

}
