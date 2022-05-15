
package za.ac.cput.factory;
import za.ac.cput.entity.Food;
import za.ac.cput.util.Helper;

public class FoodFactory {
    public  static Food createFood(String foodID, String foodDescription, String foodQuantity, String foodPrice, String foodInStock){

        if (Helper.isNullorEmpty(foodID)|| Helper.isNullorEmpty(foodDescription)|| Helper.isNullorEmpty( foodQuantity) || Helper.isNullorEmpty(foodPrice)|| Helper.isNullorEmpty(foodInStock))
            return null;

        if (foodID.equals("")||foodID == null)
            return null;
        if (foodDescription.equals("")||foodDescription== null)
            return null;
        if(foodQuantity.equals("")|| foodQuantity== null)
            return null;
        if (foodPrice.equals("")|| foodPrice == null)
            return null;
        if (foodInStock.equals("")|| foodInStock == null)
            return null;


        return new Food.Builder().setFoodID(foodID)
                .setFoodDescription(foodDescription)
                .setFoodQuantity(foodQuantity)
                .setFoodPrice(foodPrice)
                .setFoodInStock(foodInStock)
                .build();

    }
}

