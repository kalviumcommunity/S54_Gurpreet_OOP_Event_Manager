package com.eventmanagement.model;

public class Conference extends Event {
    private String keynoteSpeaker;

    public Conference(String name, String date, String location, String keynoteSpeaker) {
        super(name, date, location);
        this.keynoteSpeaker = keynoteSpeaker;
    }

    public String getKeynoteSpeaker() {
        return keynoteSpeaker;
    }

    @Override
    public void scheduleEvent() {
        super.scheduleEvent();
        System.out.println("Conference keynote speaker: " + keynoteSpeaker);
    }
}
