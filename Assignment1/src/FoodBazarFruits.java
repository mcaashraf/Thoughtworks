public class FoodBazarFruits extends FoodBazaarItem
{
   private double weight;

    public double getWeight()
    {
        return this.weight;
    }

    public void setWeight(double Weight)
    {
        this.weight=Weight;
    }
    @Override
    public double Calculate() {
        return this.getPrice() * this.getWeight();
    }
}
