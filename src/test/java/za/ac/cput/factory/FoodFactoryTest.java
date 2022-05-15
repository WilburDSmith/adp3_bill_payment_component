
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Food;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class FoodFactoryTest {
    @Test

    void createFood(){
        Food food = FoodFactory.createFood("011","Spaghetti","x2","R210", "Item is in stock");
        assertNotNull(food);
        System.out.println(food);
    }

}

