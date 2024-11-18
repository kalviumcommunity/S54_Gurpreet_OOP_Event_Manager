package model;

// Abstract Class (Abstraction)
public abstract class Event {
    private String name;
    private String date;
    private String location;

    // Static variables
    private static int eventCount = 0;
    private static int maxEventsAllowed = 100;

    public Event(String name, String date, String location) {
        if (eventCount >= maxEventsAllowed) {
            throw new IllegalStateException("Cannot create more than " + maxEventsAllowed + " events.");
        }
        this.name = name;
        this.date = date;
        this.location = location;
        eventCount++; // Increment static variable when a new event is created
    }

    // Abstract Method (Must be implemented by subclasses)
    public abstract void eventDetails();

    // Static Methods
    public static int getEventCount() {
        return eventCount;
    }

    public static void decreaseEventCount() {
        eventCount--; // Decrement static variable when an event is deleted
    }

    public static int getMaxEventsAllowed() {
        return maxEventsAllowed;
    }

    public static void setMaxEventsAllowed(int maxEvents) {
        maxEventsAllowed = maxEvents;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Virtual Function (Overridable Method)
    public void scheduleEvent() {
        System.out.println("Scheduling event: " + name + " on " + date + " at " + location);
    }
}
