package ProiectFinal.Promotion;

public class Item
{
    protected double price;
    protected double quantity;
    protected String name;
    protected double shippingCost;


    public Item(String name, double price, double quantity, double shippingCost)
    {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        this.shippingCost = shippingCost;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantityPrice(double price, double quantity) {
        this.price = price * quantity;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }


    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShippingCost(double shippingCost)
    {
        this.shippingCost = shippingCost;
    }

    public double getShippingCost()
    {
        return shippingCost;
    }



}
