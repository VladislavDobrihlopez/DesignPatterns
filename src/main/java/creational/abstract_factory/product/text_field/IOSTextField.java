package creational.abstract_factory.product.text_field;

public class IOSTextField extends TextField {
    private String value = null;

    @Override
    public void input(String text) {
        value = text;
    }

    @Override
    public String getResult() {
        return value;
    }

    @Override
    public void display() {
        System.out.println("IOS text field: " + value);
    }
}
