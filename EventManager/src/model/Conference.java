package model;

// Single Inheritance
public class Conference extends Event {
    private String keynoteSpeaker;

    // Constructor
    public Conference(String name, String date, String location, String keynoteSpeaker) {
        super(name, date, location);
        this.keynoteSpeaker = keynoteSpeaker;
    }

    // Getter and Setter
    public String getKeynoteSpeaker() {
        return keynoteSpeaker;
    }

    public void setKeynoteSpeaker(String keynoteSpeaker) {
        this.keynoteSpeaker = keynoteSpeaker;
    }

    // Overriding the scheduleEvent method (Virtual Function)
    @Override
    public void scheduleEvent() {
        super.scheduleEvent(); // Call the parent class method
        System.out.println("Conference keynote speaker: " + keynoteSpeaker);
    }

    // Overloading scheduleEvent with additional parameters
    public void scheduleEvent(String priority, int durationInHours) {
        System.out.println("Scheduling conference: " + getName());
        System.out.println("Priority: " + priority);
        System.out.println("Duration: " + durationInHours + " hours");
        System.out.println("Keynote Speaker: " + keynoteSpeaker);
    }

    // Overriding the eventDetails method from Event (Abstraction)
    @Override
    public void eventDetails() {
        System.out.println("Conference Name: " + getName());
        System.out.println("Date: " + getDate());
        System.out.println("Location: " + getLocation());
        System.out.println("Keynote Speaker: " + keynoteSpeaker);
    }
}
