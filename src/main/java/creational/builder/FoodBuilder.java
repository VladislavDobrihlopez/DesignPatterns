package creational.builder;

import creational.builder.product.Food;

public class FoodBuilder extends MealBuilder {
    @Override
    public MealBuilder setAmount(int units) {
        amount = units;
        return this;
    }

    @Override
    public MealBuilder setUnitName(String unit) {
        unitName = unit;
        return this;
    }

    public Food build() {
        return new Food(amount, unitName, "some_android_resource_id_for_food");
    }
}
