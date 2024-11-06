package model;

public class DefaultEvent {
    private String name;
    private String date;
    private String location;

    // Static variables
    private static int eventCount = 0;
    private static int maxEventsAllowed = 100;

    // Default constructor
    public DefaultEvent() {
        if (eventCount >= maxEventsAllowed) {
            throw new IllegalStateException("Cannot create more than " + maxEventsAllowed + " events.");
        }
        this.name = "Default Event";
        this.date = "01-01-2025";
        this.location = "Default Location";
        eventCount++;
    }

    // Static method to get event count
    public static int getEventCount() {
        return eventCount;
    }

    // Static method to decrease event count when an event is deleted
    public static void decreaseEventCount() {
        eventCount--;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void scheduleEvent() {
        System.out.println("Scheduling event: " + name + " on " + date + " at " + location);
    }
}
