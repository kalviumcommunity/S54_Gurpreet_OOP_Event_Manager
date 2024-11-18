package model;

// Single Inheritance
public class Meeting extends Event {
    private String agenda;

    // Constructor
    public Meeting(String name, String date, String location, String agenda) {
        super(name, date, location);
        this.agenda = agenda;
    }

    // Getter and Setter
    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    // Overriding the scheduleEvent method (Virtual Function)
    @Override
    public void scheduleEvent() {
        super.scheduleEvent(); // Call the parent class method
        System.out.println("Meeting agenda: " + agenda);
    }

    // Overriding the eventDetails method from Event (Abstraction)
    @Override
    public void eventDetails() {
        System.out.println("Meeting Name: " + getName());
        System.out.println("Date: " + getDate());
        System.out.println("Location: " + getLocation());
        System.out.println("Agenda: " + agenda);
    }

    // Overloading the scheduleEvent method for additional details
    public void scheduleEvent(boolean isVirtual, String platform) {
        String eventType = isVirtual ? "Virtual Meeting" : "In-person Meeting";
        System.out.println("Scheduling " + eventType + ": " + getName());
        if (isVirtual) {
            System.out.println("Platform: " + platform);
        }
        System.out.println("Agenda: " + agenda);
    }
}
