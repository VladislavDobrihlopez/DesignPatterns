package creational.abstract_factory.factory;

import creational.abstract_factory.product.button.AndroidButton;
import creational.abstract_factory.product.button.Button;
import creational.abstract_factory.product.calendar.AndroidCalendar;
import creational.abstract_factory.product.calendar.Calendar;
import creational.abstract_factory.product.text_field.AndroidTextField;
import creational.abstract_factory.product.text_field.TextField;

public class AndroidFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Calendar createCalendar() {
        return new AndroidCalendar();
    }

    @Override
    public TextField createTextField() {
        return new AndroidTextField();
    }
}
