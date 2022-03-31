class Dish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;


    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public Dish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public void printSummary(){
        System.out.printf("Cost:  %d \nName: %s\nRecommended: %b", costInCents, nameOfDish, wouldRecommend);
    }
    public static class DishTest{
        public static void main(String[] args) {
            Dish dish1=new Dish(2, "mai fun", false); //This creates a new object
//            dish1.nameOfDish="hush puppy";
//            dish1.costInCents =2;
//            dish1.wouldRecommend=false;
            dish1.printSummary();
            DishTools dish2 = new DishTools(3000, "fideo", "Yes", true);
            dish2.printSummary();

        }
        public static class DishTools {
            public int avgCostOfDishInCents = 13000;
            public String shoutDishName;
            public String analyzeDishCost;
            public boolean flipRecommendation;

            public int getAvgCostOfDishInCents() {
                return avgCostOfDishInCents;
            }

            public void setAvgCostOfDishInCents(int avgCostOfDishInCents) {
                this.avgCostOfDishInCents = avgCostOfDishInCents;
            }

            public String getShoutDishName() {
                return shoutDishName;
            }

            public void setShoutDishName(String shoutDishName) {
                this.shoutDishName = shoutDishName;
            }

            public String getAnalyzeDishCost() {
                return analyzeDishCost.toUpperCase();
            }

            public void setAnalyzeDishCost(String analyzeDishCost) {
                this.analyzeDishCost = analyzeDishCost;
            }

            public boolean isFlipRecommendation() {
                return flipRecommendation;
            }

            public void setFlipRecommendation(boolean flipRecommendation) {
                this.flipRecommendation = flipRecommendation;
            }

            public DishTools(int avgCostOfDishInCents, String shoutDishName, String analyzeDishCost, boolean flipRecommendation) {
                this.avgCostOfDishInCents = avgCostOfDishInCents;
                this.shoutDishName = shoutDishName;
                this.analyzeDishCost = analyzeDishCost;
                this.flipRecommendation = flipRecommendation;
            }

        }
    }
}



