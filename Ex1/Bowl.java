public class Bowl {
    private int foodAmount;

    Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    int getFoodAmount() {
        return foodAmount;
    }

    void decreaseFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
        } else {
            System.out.println("В миске недостаточно еды");
        }
    }

    void addFood(int amount) {
        foodAmount += amount;
    }
}
