package com.hexaware.dao;
import java.time.LocalDate;
import java.time.LocalTime;

import Event;
public interface IEventServiceProvider {
	 Event createEvent(String eventName, LocalDate date, LocalTime time, int totalSeats, double ticketPrice, EventType eventType, Venue venue);

	    Event[] getEventDetails();

	    int getAvailableNoOfTickets();
}
