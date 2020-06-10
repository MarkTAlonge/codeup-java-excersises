public class DishTest {

    public static void main(String[]args){

        Dish dish = new Dish();
        dish.setCostInCents(1000);
        dish.setNameOfDish("Jollof Rice");
        dish.setWouldRecommend(true);

        DishTools.analyzeDishCost(dish);
        DishTools.shoutDishName(dish);
        DishTools.flipRecommendation(dish);
        dish.printSummary();
    }
}