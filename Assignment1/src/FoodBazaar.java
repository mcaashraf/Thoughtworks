import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class FoodBazaar
{

    public static void main(String[] args) {

        List<FoodBazarFruits> fruitsList=new ArrayList<FoodBazarFruits>();
        fruitsList.add(AddFruit("Apple",100,2));
        fruitsList.add(AddFruit("Orange",80,1.5));
        fruitsList.add(AddFruit("Banana",30,0.5));
        fruitsList.add(AddFruit("Kiwi",  120,0.75));

        ItemsPurchased itemsPurchased = new ItemsPurchased();
        itemsPurchased.setFruitsPurchased(fruitsList);
        double price = itemsPurchased.CalculateTotalPrice();

        System.out.print("  Fruit     Quantity     Amount");

        for(FoodBazarFruits fruit : fruitsList) {
            System.out.format(" %n  %s    %.2f    %.2f", fruit.getName(),fruit.getWeight(),fruit.getPrice());
        }
        System.out.format(" %n  Total: %.2f",price);
    }


    public static FoodBazarFruits AddFruit(String fruitName,double price,double weight)
    {
        FoodBazarFruits fruit=new FoodBazarFruits();

        fruit.setName(fruitName);
        fruit.setPrice(price);
        fruit.setWeight(weight);
        return fruit;

    }

    }

