/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package BuilderPattern;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Vegetable Meal");
        System.out.println("---------------");
        vegMeal.showItems();
        System.out.println("Total Cost : " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon Vegetable Meal");
        System.out.println("-----------------------");
        nonVegMeal.showItems();
        System.out.println("Total Cost : " + nonVegMeal.getCost());
    }
}
