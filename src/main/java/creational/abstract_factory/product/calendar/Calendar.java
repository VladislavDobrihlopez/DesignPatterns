package creational.abstract_factory.product.calendar;

import java.time.LocalDateTime;

public abstract class Calendar {
    public abstract LocalDateTime chooseDate();
    public abstract void display();
}
