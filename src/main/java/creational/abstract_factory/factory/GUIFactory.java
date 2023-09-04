package creational.abstract_factory.factory;

import creational.abstract_factory.product.button.Button;
import creational.abstract_factory.product.calendar.Calendar;
import creational.abstract_factory.product.text_field.TextField;

public interface GUIFactory {
    public Button createButton();
    public Calendar createCalendar();
    public TextField createTextField();
}
