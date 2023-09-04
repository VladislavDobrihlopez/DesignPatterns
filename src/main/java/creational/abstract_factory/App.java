package creational.abstract_factory;

import creational.abstract_factory.factory.AndroidFactory;
import creational.abstract_factory.factory.GUIFactory;
import creational.abstract_factory.product.button.Button;
import creational.abstract_factory.product.calendar.Calendar;
import creational.abstract_factory.product.text_field.TextField;

public class App {
    public static void main(String[] args) {
        GUIFactory guiFactory = new AndroidFactory();
        renderUi(guiFactory);
    }

    private static void renderUi(GUIFactory guiFactory) {
        Button button = guiFactory.createButton();
        Calendar calendar = guiFactory.createCalendar();
        TextField textField = guiFactory.createTextField();

        button.click();
        calendar.chooseDate();
        calendar.display();

        textField.input("Some text");
        textField.display();
    }
}
