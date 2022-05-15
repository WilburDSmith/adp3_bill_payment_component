package za.ac.cput.adp3_bill_payment_component.domain;

import java.util.HashMap;

public class RestaurantItems
{
    HashMap<String,String> restaurantItems = new HashMap<>();

    private void PopulateRestaurantItems()
    {
        restaurantItems.put("Spaghetti", "R30");
        restaurantItems.put("Salad", "R50");
        restaurantItems.put("Burger", "R60");
        restaurantItems.put("Lobster", "R90");
    }

    public HashMap getRestaurantItems()
    {
        return restaurantItems;
    }
}
