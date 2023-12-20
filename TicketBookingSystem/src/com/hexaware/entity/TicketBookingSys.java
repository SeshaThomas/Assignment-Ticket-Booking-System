package com.hexaware.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.hexaware.dao.IBookingSystemServiceProvider;
import com.hexaware.dao.IEventServiceProvider;

public class TicketBookingSys{
    private Event[] events;
    private Booking[] bookings;
    private List<Venue> venues;
    private Set<Venue> venues;
    private Set<Event> events;
    private Set<Booking> bookings;


    public TicketBookingSys() {
        
        events = new Event[10]; 
        bookings = new Booking[10];
        this.venues = new ArrayList<>();
        this.venues = new HashSet<>();
        this.events = new HashSet<>();
        this.bookings = new HashSet<>();
    }
    

    public void createEvent(String eventName, LocalDate eventDate, LocalTime eventTime, String venueName,
                            int totalSeats, double ticketPrice, EventType eventType) {
        
        int index = findAvailableIndex(events);
        if (index != -1) {
            events[index] = new Event(eventName, eventDate, eventTime, venueName, totalSeats, index, ticketPrice, eventType);
            System.out.println("Event created successfully: " + eventName);
        } else {
            System.out.println("Cannot create event. Events array is full.");
        }
    }
   
    public void displayEventDetails(Event event) {
        event.displayEventDetails();
    }
    public void createVenue(String venueName, String address) {
        Venue venue = new Venue(venueName, address);
        venues.add(venue);
    }

    public void displayVenueDetails(Venue venue) {
        venue.displayVenueDetails();
    }

    public double calculateBookingCost(Event event, int numTickets) {
        return event.calculateTotalRevenue(numTickets);
    }

    public void bookTickets(Event event, int numTickets, Customer[] customers) {
        
        int index = findAvailableIndex(bookings);
        if (index != -1) {
            event.bookTickets(numTickets);
            bookings[index] = new Booking(event, customers, numTickets, null);
            System.out.println("Tickets booked successfully for event: " + event.getEventName());
        } else {
            System.out.println("Cannot book tickets. Bookings array is full.");
        }
    }

    public void cancelBooking(int bookingId) {
        
        int index = findBookingIndex(bookingId);
        if (index != -1) {
            Booking booking = bookings[index];
            booking.getEvent().cancelBooking(booking.getNumTickets());
            bookings[index] = null;
            System.out.println("Booking canceled successfully. Booking ID: " + bookingId);
        } else {
            System.out.println("Booking not found. Invalid Booking ID: " + bookingId);
        }
    }

    public int getAvailableNoOfTickets(Event event) {
        return event.getAvailableSeats();
    }

    public String getEventDetails(Event event) {
        return event.toString();
    }

    private int findAvailableIndex(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                return i;
            }
        }
        return -1; 
    }
 
    private int findBookingIndex(int bookingId) {
        for (int i = 0; i < bookings.length; i++) {
            if (bookings[i] != null && bookings[i].getBookingId() == bookingId) {
                return i;
            }
        }
        return -1; 
    }

    private IEventServiceProvider eventServiceProvider;
    private IBookingSystemServiceProvider bookingSystemServiceProvider;

    public TicketBookingSystem() {
        this.eventServiceProvider = new EventServiceProviderImpl();
        this.bookingSystemServiceProvider = new BookingSystemServiceProviderImpl();
    } 
   
    public static void main(String[] args) {
        TicketBookingSys ticketBookingSystem = new TicketBookingSys();

        
        ticketBookingSystem.createEvent("Movie Night",LocalDate.of(2023,01,01),LocalTime.of(18,44),
                "ABC Theater", 100,10.0, EventType.MOVIE);

        // Displaying event details
        Event event = ticketBookingSystem.events[0];
        ticketBookingSystem.displayEventDetails(event);

        
        Customer customer1 = new Customer("John Doe", "john@example.com", "1234567890");
        Customer customer2 = new Customer("Jane Doe", "jane@example.com", "9876543210");
        Customer[] customers = {customer1, customer2};
        ticketBookingSystem.bookTickets(event, 2, customers);

        
        System.out.println("Available Seats: " + ticketBookingSystem.getAvailableNoOfTickets(event));

        
        System.out.println("Event Details: " + ticketBookingSystem.getEventDetails(event));

        
        int bookingId = 1;  
        ticketBookingSystem.cancelBooking(bookingId);  
    }}

    try {
        
    } catch (EventNotFoundException e) {
        System.out.println("Error: " + e.getMessage());
    } catch (InvalidBookingIDException e) {
        System.out.println("Error: " + e.getMessage());
    } catch (NullPointerException e) {
        System.out.println("Error: " + e.getMessage());
    }
}

   
}  