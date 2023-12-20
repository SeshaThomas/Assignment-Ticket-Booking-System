package com.hexaware.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class TicketBookingSystem {

	public void createEvent(String string, LocalDate of, LocalTime of2, String string2, int i, double d,
			EventType movie) {
		// TODO Auto-generated method stub
		
	}

	public void displayEventDetails(Event event) {
		// TODO Auto-generated method stub
		
	}
  
	public void bookTickets(Event event, int i, Customer[] customers) {
		// TODO Auto-generated method stub
		
	}

	public Event[] getEvents() {
		return null;
		
		// TODO Auto-generated method stub
		
	}
 
	public String getAvailableNoOfTickets(Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEventDetails(Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	public void cancelBooking(int bookingId) {
		// TODO Auto-generated method stub
		
	}

	public void displayEventDetails(Event[] event) {
		// TODO Auto-generated method stub
		
	}
	 public abstract void abstractMethod();
 
}
