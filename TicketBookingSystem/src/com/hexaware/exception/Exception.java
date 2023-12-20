package com.hexaware.exception;

public class Exception {
	class EventNotFoundException extends RuntimeException {
	    public EventNotFoundException(String message) {
	        super(message);
	    }
	}

	class InvalidBookingIDException extends RuntimeException {
	    public InvalidBookingIDException(String message) {
	        super(message);
	    }
	}

	class TicketBookingSystem {
	    // Existing code

	    public void bookTickets(Event event, int numTickets, Customer[] customers) {
	        if (event == null) {
	            throw new EventNotFoundException("Event not found");
	        }

	        // Implement logic to book tickets for an event and create a booking
	    }

	    public void cancelBooking(int bookingId) {
	        if (bookingId <= 0) {
	            throw new InvalidBookingIDException("Invalid Booking ID");
	        }

	        // Implement logic to cancel a booking and update available seats
	    }

	    public static void main(String[] args) {
	        try {
	            // Implement the main method to simulate the ticket booking system
	        } catch (EventNotFoundException e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (InvalidBookingIDException e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (NullPointerException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}
}
