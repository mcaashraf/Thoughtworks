import java.util.List;

public class ItemsPurchased
{
    private List<FoodBazarFruits> fruitsPurchased;
    public  List<FoodBazarFruits>  getFruitsPurchased()
    {
        return this.fruitsPurchased;
    }

    public void setFruitsPurchased(List<FoodBazarFruits> fruitsPurchased)
    {

        this.fruitsPurchased=fruitsPurchased;
    }
    
    public double CalculateTotalPrice()
    {
        double price=0;
        if(this.fruitsPurchased!=null)
        {
            for (FoodBazaarItem fruit:fruitsPurchased)
            {
                price+=fruit.Calculate();
            }
        }
        return price;
    }
}
