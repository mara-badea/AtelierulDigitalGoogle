package ProiectFinal.Promotion;

public abstract class Promotion
{
    protected Promotion nextPromotion;
    protected String storeName;
    protected String description;
    protected int promotionId;

    public Promotion() {}

    public Promotion(Promotion nextPromotion, String storeName, String description, int promotionId)
    {
        this.nextPromotion = nextPromotion;
        this.storeName = storeName;
        this.description = description;
        this.promotionId = promotionId;
    }
    public abstract void applyPromotion(Item item);

    public abstract boolean isEligible(Item item);

    public void setNextPromotion(Promotion nextPromotion)
    {
        this.nextPromotion = nextPromotion;
    }
    public Promotion getNextPromotion()
    {
        return this.nextPromotion;
    }
    public void setNextPromotionId(Promotion nextPromotion) {
        this.nextPromotion = nextPromotion;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPromotionId(int promotionId) {
        this.promotionId = promotionId;
    }

    public int getPromotionId() {
        return promotionId;
    }

    public String getStoreName() {
        return storeName;
    }
}
