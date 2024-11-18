package model;

// Single Inheritance
public class Party extends Event {
    private int numberOfGuests;

    // Constructor
    public Party(String name, String date, String location, int numberOfGuests) {
        super(name, date, location);
        this.numberOfGuests = numberOfGuests;
    }

    // Getter and Setter
    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    // Overriding the scheduleEvent method (Virtual Function)
    @Override
    public void scheduleEvent() {
        super.scheduleEvent(); // Call the parent class method
        System.out.println("Party guest count: " + numberOfGuests);
    }

    // Overriding the eventDetails method from Event (Abstraction)
    @Override
    public void eventDetails() {
        System.out.println("Party Name: " + getName());
        System.out.println("Date: " + getDate());
        System.out.println("Location: " + getLocation());
        System.out.println("Number of Guests: " + numberOfGuests);
    }

    // Overloading the scheduleEvent method for additional details
    public void scheduleEvent(boolean isOutdoor, String theme) {
        String eventType = isOutdoor ? "Outdoor Party" : "Indoor Party";
        System.out.println("Scheduling " + eventType + ": " + getName());
        System.out.println("Theme: " + theme);
        System.out.println("Guest Count: " + numberOfGuests);
    }
}
