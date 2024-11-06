package controller;

import model.Meeting;
import model.Party;
import model.Conference;
import model.Webinar;
import model.DefaultEvent;  // Import DefaultEvent
import service.EventService;

public class EventController {
    private EventService eventService = new EventService();

    public void run() {
        eventService.updateMaxEventsAllowed(5);  // Set a limit for maximum events

        Meeting meeting = new Meeting("Team Meeting", "2024-09-10", "Conference Room A", "Project Updates");
        Party party = new Party("Office Party", "2024-09-12", "Rooftop", 50);
        Conference conference = new Conference("Tech Conference", "2024-09-20", "Main Hall", "Dr. Smith");
        Webinar webinar = new Webinar("AI Webinar", "2024-09-30", "Online", "Prof. Williams", "Zoom");

        // Create a default event without specific details
        DefaultEvent defaultEvent = new DefaultEvent();

        // Adding events to the service
        eventService.createEvent(meeting);
        eventService.createEvent(party);
        eventService.createEvent(conference);
        eventService.createEvent(webinar);
        
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

        // Deleting an event and displaying the updated list
        eventService.deleteEvent("Office Party");
        eventService.listAllEvents();
        eventService.printEventCount();
    }
}
