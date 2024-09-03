package service;

import model.Event;
import java.util.ArrayList;
import java.util.List;

public class EventService {
    private List<Event> events = new ArrayList<>();

    public void createEvent(Event event) {
        events.add(event);
        System.out.println("Event created: " + event.getName());
    }

    public void listAllEvents() {
        if (events.isEmpty()) {
            System.out.println("No events scheduled.");
        } else {
            for (Event event : events) {
                System.out.println(event.getName() + " on " + event.getDate() + " at " + event.getLocation());
            }
        }
    }

    public void scheduleEvent(Event event) {
        event.scheduleEvent();
    }
}
