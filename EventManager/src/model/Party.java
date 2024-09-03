package com.eventmanagement.model;

public class Party extends Event {
    private int numberOfGuests;

    public Party(String name, String date, String location, int numberOfGuests) {
        super(name, date, location);
        this.numberOfGuests = numberOfGuests;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    @Override
    public void scheduleEvent() {
        super.scheduleEvent();
        System.out.println("Party guest count: " + numberOfGuests);
    }
}
