package creational.abstract_factory.product.button;

public class IOSButton extends Button {
    @Override
    public void click() {
        System.out.println("IOS button");
    }
}
