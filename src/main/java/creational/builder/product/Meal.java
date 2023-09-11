package creational.builder.product;

public abstract class Meal {
    public final int amount;
    public final String unitName;

    public final String imgUri;

    public Meal(int amount, String unitName, String imgUri) {
        this.amount = amount;
        this.unitName = unitName;
        this.imgUri = imgUri;
    }

    @Override
    public String toString() {
        return "Amount: " + amount + "\n" + "unitName: " + unitName + "\n" + "imgUri: " + imgUri;
    }
}
