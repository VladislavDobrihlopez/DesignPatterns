package creational.builder;

import creational.builder.product.Meal;

public abstract class MealBuilder {
    protected String unitName;
    protected int amount;

    public final MealBuilder reset() {
        amount = 0;
        unitName = "";
        return this;
    }

    public abstract MealBuilder setAmount(int units);

    public abstract MealBuilder setUnitName(String unit);
    public abstract Meal build();
}
