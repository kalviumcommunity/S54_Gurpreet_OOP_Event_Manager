package controller;

import model.Meeting;
import model.Party;
import model.Conference;
import model.Webinar;
import model.DefaultEvent;  // Import DefaultEvent
import model.BirthdayParty;  // Import BirthdayParty
import service.EventService;

public class EventController {
    private EventService eventService = new EventService();

    public void run() {
        eventService.updateMaxEventsAllowed(6);  // Increase limit for maximum events

        // Create various event types
        Meeting meeting = new Meeting("Team Meeting", "2024-09-10", "Conference Room A", "Project Updates");
        Party party = new Party("Office Party", "2024-09-12", "Rooftop", 50);
        Conference conference = new Conference("Tech Conference", "2024-09-20", "Main Hall", "Dr. Smith");
        Webinar webinar = new Webinar("AI Webinar", "2024-09-30", "Online", "Prof. Williams", "Zoom");

        // Create a default event without specific details
        DefaultEvent defaultEvent = new DefaultEvent();

        // Create a BirthdayParty event
        BirthdayParty birthdayParty = new BirthdayParty(
            "John's Birthday Bash", 
            "2024-12-25", 
            "Central Park", 
            30, 
            "John Doe", 
            25
        );

        // Adding events to the service
        eventService.createEvent(meeting);
        eventService.createEvent(party);
        eventService.createEvent(conference);
        eventService.createEvent(webinar);
        eventService.createEvent(birthdayParty);  // Add BirthdayParty event
        
        // Adding the default event explicitly
        System.out.println("Default Event Created:");
        System.out.println(defaultEvent.getName() + " on " + defaultEvent.getDate() + " at " + defaultEvent.getLocation());

        // Display all events
        eventService.listAllEvents();
        eventService.printEventCount();
        eventService.printMaxEventsAllowed();  // Show the maximum number of events allowed

        // Schedule events
        eventService.scheduleEvent(meeting);
        eventService.scheduleEvent(party);
        eventService.scheduleEvent(conference);
        eventService.scheduleEvent(webinar);
        eventService.scheduleEvent(birthdayParty);  // Schedule BirthdayParty event

        // Call specific methods for BirthdayParty
        birthdayParty.arrangeCake("Chocolate", 3);

        // Deleting an event and displaying the updated list
        eventService.deleteEvent("Office Party");
        eventService.listAllEvents();
        eventService.printEventCount();
    }
}
