package za.ac.cput.entity;

public class Table {
    private String foodDescription;
    private String tableNumber;

    private Table(Table.Builder builder) {
        this.foodDescription = builder.foodDescription;
        this.tableNumber = builder.tableNumber;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    @Override
    public String toString() {
        return "Table{" +
                "foodDescription='" + foodDescription + '\'' +
                ", tableNumber='" + tableNumber + '\'' +
                '}';
    }

    public void set(String tableNumber, String foodDescription) {
        this.foodDescription = foodDescription;
        this.tableNumber = tableNumber;
    }

    public static class Builder {
        private String foodDescription;
        private String tableNumber;

        public Table.Builder setFoodDescription(String foodDescription) {
            this.foodDescription = foodDescription;
            return this;
        }

        public Table.Builder setTableNumber(String tableNumber){
            this.tableNumber = tableNumber;
            return this;
        }

        public Table.Builder copy(Table table) {
            this.foodDescription = table.foodDescription;
            this.tableNumber = table.tableNumber;
            return this;
        }
        public Table build() {
            return new Table(this);

        }
    }
}
