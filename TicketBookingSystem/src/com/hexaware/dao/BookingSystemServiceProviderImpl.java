package com.hexaware.dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

class BookingSystemServiceProviderImpl extends EventServiceProviderImpl implements IBookingSystemServiceProvider {
    private List<Booking> bookings;

    public BookingSystemServiceProviderImpl() {
        this.bookings = new ArrayList<>();
    }

    @Override
    public double calculateBookingCost(int numTickets) {
        // Implement logic to calculate booking cost
        return 0;
    }

    @Override
    public void bookTickets(String eventName, int numTickets, Customer[] arrayOfCustomer) {
        // Implement logic to book tickets
    }

    @Override
    public void cancelBooking(int bookingId) {
        // Implement logic to cancel booking
    }

    @Override
    public Booking getBookingDetails(int bookingId) {
        // Implement logic to get booking details
        return null;
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

	@Override
	public double calculateBookingCost(int numTickets) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Booking getBookingDetails(int bookingId) {
		// TODO Auto-generated method stub
		return null;
	}
}
