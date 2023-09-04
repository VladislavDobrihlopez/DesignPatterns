package creational.abstract_factory.factory;

import creational.abstract_factory.product.button.Button;
import creational.abstract_factory.product.button.IOSButton;
import creational.abstract_factory.product.calendar.Calendar;
import creational.abstract_factory.product.calendar.IOSCalendar;
import creational.abstract_factory.product.text_field.IOSTextField;
import creational.abstract_factory.product.text_field.TextField;

public class IOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Calendar createCalendar() {
        return new IOSCalendar();
    }

    @Override
    public TextField createTextField() {
        return new IOSTextField();
    }
}
