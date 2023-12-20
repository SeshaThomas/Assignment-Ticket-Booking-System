package com.hexaware.dao;

public interface IBookingSystemServiceProvider {
	double calculateBookingCost(int numTickets);

	    void bookTickets(String eventName, int numTickets, Customer[] arrayOfCustomer);

	    void cancelBooking(int bookingId);

	    Booking getBookingDetails(int bookingId);
}
