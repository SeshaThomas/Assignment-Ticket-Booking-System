package com.hexaware.dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.events.Event;

class EventServiceProviderImpl implements IEventServiceProvider {
    private static int eventIdCounter = 1;
    private List<Event> events;

    public EventServiceProviderImpl() {
        this.events = new ArrayList<>();
    }

    @Override
    public Event createEvent(String eventName, LocalDate date, LocalTime time, int totalSeats, double ticketPrice, EventType eventType, Venue venue) {
        Event event;
        switch (eventType) {
            case MOVIE:
                event = new Movie(eventName, date, time, venue.getVenueName(), totalSeats, ticketPrice, "Action", "Actor", "Actress");
                break;
            case SPORTS:
                event = new Sports(eventName, date, time, venue.getVenueName(), totalSeats, ticketPrice, "Football", "TeamA vs TeamB");
                break;
            case CONCERT:
                event = new Concert(eventName, date, time, venue.getVenueName(), totalSeats, ticketPrice, "Artist", "Rock");
                break;
            default:
                throw new IllegalArgumentException("Invalid event type");
        }
        events.add(event);
        return event;
    }

    @Override
    public Event[] getEventDetails() {
        return events.toArray(new Event[0]);
    }

    @Override
    public int getAvailableNoOfTickets() {
        // Implement logic to get total available tickets across all events
        return 0;
    }

	@Override
	public Event createEvent(String eventName, LocalDate date, LocalTime time, int totalSeats, double ticketPrice,
			EventType eventType, Venue venue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Event[] getEventDetails() {
		// TODO Auto-generated method stub
		return null;
	}
}
