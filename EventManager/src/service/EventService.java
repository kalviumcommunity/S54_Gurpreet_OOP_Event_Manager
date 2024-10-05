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

    public void deleteEvent(String eventName) {
        boolean removed = events.removeIf(event -> event.getName().equals(eventName));
        if (removed) {
            Event.decreaseEventCount(); // Decrement static event count
            System.out.println("Event deleted: " + eventName);
        } else {
            System.out.println("Event not found: " + eventName);
        }
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

    public void printEventCount() {
        System.out.println("Total events: " + Event.getEventCount()); // Static method call
    }

    public void printMaxEventsAllowed() {
        System.out.println("Maximum events allowed: " + Event.getMaxEventsAllowed()); // Static method call
    }

    public void updateMaxEventsAllowed(int maxEvents) {
        Event.setMaxEventsAllowed(maxEvents);  // Update the maximum number of events allowed
        System.out.println("Max events allowed updated to: " + maxEvents);
    }
}
