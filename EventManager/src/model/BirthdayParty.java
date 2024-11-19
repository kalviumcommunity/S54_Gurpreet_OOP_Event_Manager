package model;

// Multi-level Inheritance
public class BirthdayParty extends Party {
    private String birthdayPerson;
    private int age;

    // Constructor
    public BirthdayParty(String name, String date, String location, int numberOfGuests, String birthdayPerson, int age) {
        super(name, date, location, numberOfGuests); // Call the Party constructor
        this.birthdayPerson = birthdayPerson;
        this.age = age;
    }

    // Getters and Setters
    public String getBirthdayPerson() {
        return birthdayPerson;
    }

    public void setBirthdayPerson(String birthdayPerson) {
        this.birthdayPerson = birthdayPerson;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Overriding the eventDetails method
    @Override
    public void eventDetails() {
        super.eventDetails(); // Call the Party's eventDetails method
        System.out.println("Birthday Person: " + birthdayPerson);
        System.out.println("Age: " + age);
    }

    // Additional functionality for BirthdayParty
    public void arrangeCake(String cakeFlavor, int layers) {
        System.out.println("Arranging a " + cakeFlavor + " cake with " + layers + " layers for " + birthdayPerson);
    }

    // Overriding the scheduleEvent method
    @Override
    public void scheduleEvent() {
        super.scheduleEvent(); // Call the Party's scheduleEvent method
        System.out.println("Special preparations for the birthday of " + birthdayPerson);
    }
}
