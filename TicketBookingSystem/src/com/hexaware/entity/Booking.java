package com.hexaware.entity;

import java.time.LocalDate;
import java.time.LocalTime;

class Booking {
    private static int bookingIdCounter = 1;
    private int bookingId;
    private Event event;
    private Customer[] customers;
    private int numTickets;
    private double totalCost;
    private LocalDate bookingDate;
    private Venue venue;

    public Booking() {
       this.bookingId=0;
      this.numTickets=0;
      this.totalCost=0;
      this.bookingDate=LocalDate.now();
      this.venue = new Venue();
    }

    public Booking(Event event, Customer[] customers, int numTickets,LocalDate bookingDate,Venue venue) {
        this.bookingId = bookingIdCounter++;
        this.event = event;
        this.customers = customers;
        this.numTickets = numTickets;
        this.totalCost = event.calculateTotalRevenue(numTickets);
        this.bookingDate =bookingDate;
        this.venue = venue;
    }

    

    public int getBookingId() {
        return bookingId;
    }

    public Event getEvent() {
        return event;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public int getNumTickets() {
        return numTickets;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }
    
    @Override
    public String toString() {
        return "Booking{" +
                super.toString() +
                ", venue=" + venue +
                '}';
    }

    public void displayBookingDetails() {
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Event: " + event.getEventName());
        System.out.println("Number of Tickets: " + numTickets);
        System.out.println("Total Cost: " + totalCost);
        System.out.println("Booking Date: " + bookingDate);
    }
    
}
 

