package model;

// Single Inheritance
public class Webinar extends Event {
    private String presenter;
    private String platform;

    // Constructor
    public Webinar(String name, String date, String location, String presenter, String platform) {
        super(name, date, location);
        this.presenter = presenter;
        this.platform = platform;
    }

    // Getters and Setters
    public String getPresenter() {
        return presenter;
    }

    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    // Overriding the scheduleEvent method (Virtual Function)
    @Override
    public void scheduleEvent() {
        super.scheduleEvent(); // Call the parent class method
        System.out.println("Webinar presenter: " + presenter + " on platform: " + platform);
    }

    // Overriding the eventDetails method from Event (Abstraction)
    @Override
    public void eventDetails() {
        System.out.println("Webinar Name: " + getName());
        System.out.println("Date: " + getDate());
        System.out.println("Location: " + getLocation());
        System.out.println("Presenter: " + presenter);
        System.out.println("Platform: " + platform);
    }

    // Overloading the scheduleEvent method for webinars with registration links
    public void scheduleEvent(String registrationLink) {
        System.out.println("Scheduling Webinar: " + getName());
        System.out.println("Date: " + getDate());
        System.out.println("Location: " + getLocation());
        System.out.println("Presenter: " + presenter);
        System.out.println("Platform: " + platform);
        System.out.println("Registration Link: " + registrationLink);
    }
}
