package creational.builder;

import creational.builder.product.Drink;

public class DrinksBuilder extends MealBuilder {
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

    public Drink build() {
        return new Drink(amount, unitName, "some_android_resource_id_for_drinks");
    }
}
