class Dish {
    int costInCents;
    String nameOfDish;
    boolean wouldRecommend;


    public void printSummary(){
        System.out.printf("Cost:  %d \nName: %s\nRecommended: %b", costInCents, nameOfDish, wouldRecommend);
    }
    public static class DishTest{
        public static void main(String[] args) {
            Dish dish1=new Dish(); //This creates a new object
            dish1.nameOfDish="hush puppy";
            dish1.costInCents =2;
            dish1.wouldRecommend=false;

            dish1.printSummary();

        }
    }
}



