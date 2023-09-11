package creational.builder;

import creational.builder.product.Meal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Meal> mealsForDisplaying = new ArrayList<>();
        DrinksBuilder drinksBuilder = new DrinksBuilder();
        FoodBuilder foodBuilder = new FoodBuilder();

        for (int i = 0; i < 10; i++) {
            int amount = random.nextInt(1000);
            Meal meal;
            if (i % 2 == 0) {
                meal = drinksBuilder
                        .setUnitName("ml")
                        .setAmount(amount)
                        .build();
            } else {
                meal = foodBuilder
                        .setUnitName("g")
                        .setAmount(amount)
                        .build();
            }
            mealsForDisplaying.add(meal);
        }

        for (Meal meal: mealsForDisplaying) {
            System.out.println(meal.toString());
        }
    }
}
