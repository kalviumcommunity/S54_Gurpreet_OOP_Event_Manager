package model;

public class Event {
    private String name;
    private String date;
    private String location;

    public Event(String name, String date, String location) {
        this.name = name;
        this.date = date;
        this.location = location;
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
    public void setName( String Name) {
        this.name = Name;
    }
    public void setDate(String Date) {
        this.date = Date;
    }
    public void setLocation(String Location) {
        this.location = Location;
    }
    

    public void scheduleEvent() {
        System.out.println("Scheduling event: " + name + " on " + date + " at " + location);
    }
}
