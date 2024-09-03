import model.Meeting;
import model.Party;

public class Main {
    public static void main(String[] args) {
        Meeting meeting = new Meeting("Team Meeting", "2024-09-10", "Conference Room A", "Project Updates");
        Party party = new Party("Office Party", "2024-09-12", "Rooftop", 50);

        
        System.out.println("Meeting Details:");
        System.out.println("Name: " + meeting.getName());
        System.out.println("Date: " + meeting.getDate());
        System.out.println("Location: " + meeting.getLocation());
        System.out.println("Agenda: " + meeting.getAgenda());
        meeting.scheduleEvent(); 

        System.out.println(); 

       
        System.out.println("Party Details:");
        System.out.println("Name: " + party.getName());
        System.out.println("Date: " + party.getDate());
        System.out.println("Location: " + party.getLocation());
        System.out.println("Number of Guests: " + party.getNumberOfGuests());
        party.scheduleEvent();  
    }
}
