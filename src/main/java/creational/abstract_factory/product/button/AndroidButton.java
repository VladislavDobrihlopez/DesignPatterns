package creational.abstract_factory.product.button;

public class AndroidButton extends Button {
    @Override
    public void click() {
        System.out.println("Android button");
    }
}
