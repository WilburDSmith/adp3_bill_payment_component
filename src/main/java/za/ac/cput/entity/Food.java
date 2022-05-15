
package za.ac.cput.entity;

public class Food {
    private String foodID;
    private String foodDescription;
    private String foodQuantity;
    private String foodPrice;
    private String foodInStock;


    private Food(Food.Builder builder) {
        this.foodID = builder.foodID;
        this.foodDescription = builder.foodDescription;
        this.foodQuantity = builder.foodQuantity ;
        this.foodPrice = builder.foodPrice;
        this.foodInStock = builder.foodInStock;
    }

    public String getFoodID() {
        return foodID;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public String getFoodQuantity() {
        return foodQuantity;
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public String getFoodInStock() {
        return foodInStock;
    }

    public void setFoodID(String foodID) {
        this.foodID = foodID;
    }

    public void setFoodQuantity(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription= foodDescription;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }

    public void setFoodInStock(String foodInStock) {
        this.foodInStock = foodInStock;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodID='" + foodID + '\'' +
                ", foodDescription='" + foodDescription + '\'' +
                ", foodQuantity='" + foodQuantity + '\'' +
                ", foodPrice='" + foodPrice + '\'' +
                ", foodInStock='" + foodInStock + '\'' +
                '}';
    }


    public void set(String foodID, String foodDescription, String foodQuantity, String foodPrice, String foodInStock) {
        this.foodID = foodID;
        this.foodDescription = foodDescription;
        this.foodQuantity= foodQuantity;
        this.foodPrice = foodPrice;
        this.foodInStock = foodInStock;

    }
    public static class Builder{
        private String foodID;
        private String foodDescription;
        private String foodQuantity;
        private String foodPrice;
        private String foodInStock;

        public Food.Builder setFoodID(String foodID){
            this.foodID = foodID;
            return this;
        }

        public Food.Builder setFoodDescription(String foodDescription) {
            this.foodDescription = foodDescription;
            return this;
        }

        public Food.Builder setFoodQuantity(String foodQuantity) {
            this.foodQuantity = foodQuantity;
            return this;
        }

        public Food.Builder setFoodPrice(String foodPrice) {
            this.foodPrice =foodPrice;
            return this;
        }

        public Food.Builder setFoodInStock(String foodInStock) {
            this.foodInStock =foodInStock;
            return this;
        }
        public Food.Builder copy(Food food) {
            this.foodID = food.foodID;
            this.foodDescription = food.foodDescription;
            this.foodQuantity = food.foodQuantity;
            this.foodPrice = food.foodPrice;
            this.foodInStock = food.foodInStock;
            return this;
        }
        public Food build() {
            return new Food(this);

        }
    }
}



