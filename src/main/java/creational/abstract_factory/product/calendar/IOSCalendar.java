package creational.abstract_factory.product.calendar;

import java.time.LocalDateTime;

public class IOSCalendar extends Calendar {
    private LocalDateTime dateTime = null;

    @Override
    public LocalDateTime chooseDate() {
        dateTime = LocalDateTime.now();
        return dateTime;
    }

    @Override
    public void display() {
        System.out.println("Chosen IOS date: " + dateTime);
    }
}
