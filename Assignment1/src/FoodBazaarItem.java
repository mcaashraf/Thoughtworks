abstract class FoodBazaarItem {


    private String name;
    private double price=0;

    public String getName() { return this.name; }
    public void setName(String Name) { this.name = Name; }

    public double getPrice()
    {
        return this.price;
    }

    public void setPrice(double Price)
    {
        this.price=Price;;
    }

    public abstract double Calculate();

}
