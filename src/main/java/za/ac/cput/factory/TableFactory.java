package za.ac.cput.factory;

import za.ac.cput.entity.Table;
import za.ac.cput.util.Helper;

public class TableFactory {
    public  static Table createTable(String foodDescription, String tableNumber){

        if (Helper.isNullorEmpty(foodDescription)|| Helper.isNullorEmpty(tableNumber))
            return null;

        if (foodDescription.equals("")||foodDescription== null)
            return null;
        if(tableNumber.equals("")|| tableNumber== null)
            return null;


        return new Table.Builder()
                .setFoodDescription(foodDescription)
                .setTableNumber(tableNumber)
                .build();
    }
}
