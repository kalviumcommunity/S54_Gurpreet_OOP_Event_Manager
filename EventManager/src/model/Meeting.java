package model;

public class Meeting extends Event {
    private String agenda;

    public Meeting(String name, String date, String location, String agenda) {
        super(name, date, location);
        this.agenda = agenda;
    }

    public String getAgenda() {
        return agenda;
    }
    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    @Override
    public void scheduleEvent() {
        super.scheduleEvent();
        System.out.println("Meeting agenda: " + agenda);
    }
}
