package com.eventmanagement.controller;

import com.eventmanagement.model.Meeting;
import com.eventmanagement.model.Party;
import com.eventmanagement.model.Conference;
import com.eventmanagement.service.EventService;

public class EventController {
    private EventService eventService = new EventService();

    public void run() {
        // Create events
        Meeting meeting = new Meeting("Team Meeting", "2024-09-10", "Conference Room A", "Project Updates");
        Party party = new Party("Office Party", "2024-09-12", "Rooftop", 50);
        Conference conference = new Conference("Tech Conference", "2024-09-20", "Main Hall", "Dr. Smith");

        // Add events
        eventService.createEvent(meeting);
        eventService.createEvent(party);
        eventService.createEvent(conference);

        // List all events
        eventService.listAllEvents();

        // Schedule events
        eventService.scheduleEvent(meeting);
        eventService.scheduleEvent(party);
        eventService.scheduleEvent(conference);
    }
}
