package com.eventmanagement;

import com.eventmanagement.controller.EventController;

public class Main {
    public static void main(String[] args) {
        EventController controller = new EventController();
        controller.run();  // Start the event management process
    }
}
