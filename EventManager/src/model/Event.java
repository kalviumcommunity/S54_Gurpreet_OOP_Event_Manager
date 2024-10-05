package model;

public class Event {
    private String name;
    private String date;
    private String location;
    
    // Static variables
    private static int eventCount = 0;
    private static int maxEventsAllowed = 100;  // New static variable

    public Event(String name, String date, String location) {
        if (eventCount >= maxEventsAllowed) {
            throw new IllegalStateException("Cannot create more than " + maxEventsAllowed + " events.");
        }
        this.name = name;
        this.date = date;
        this.location = location;
        eventCount++;  // Increment static variable when a new event is created
    }

    // Static method to get event count
    public static int getEventCount() {
        return eventCount;
    }

    // Static method to decrease event count when an event is deleted
    public static void decreaseEventCount() {
        eventCount--;  // Decrement static variable when an event is deleted
    }

    // Static method to get the maximum number of events allowed
    public static int getMaxEventsAllowed() {
        return maxEventsAllowed;
    }

    // Static method to set the maximum number of events allowed
    public static void setMaxEventsAllowed(int maxEvents) {
        maxEventsAllowed = maxEvents;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public void scheduleEvent() {
        System.out.println("Scheduling event: " + name + " on " + date + " at " + location);
    }
}
