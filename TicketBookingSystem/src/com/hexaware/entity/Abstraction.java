package com.hexaware.entity;

import java.time.LocalDate;
import java.time.LocalTime;


public class Abstraction {
	enum EventType {
	    MOVIE, SPORTS, CONCERT
	} 
	abstract class Event { 
		  



			private String eventName;
		    private LocalDate eventDate;
		    private LocalTime eventTime;
		    private String venueName;
		    private int totalSeats;
		    private int availableSeats;
		    private double ticketPrice;
		    private EventType eventType;

		    public Event() {
		    	this.eventName="default";
		    	this.eventDate=LocalDate.now();
		    	this.eventTime=LocalTime.now();
		    	this.venueName="default";
		    	this.totalSeats=0;
		    	this.availableSeats=0;
		    	this.ticketPrice=0.0;
		    	this.eventType=EventType.MOVIE;
		    }

		    public Event(String eventName, LocalDate eventDate, LocalTime eventTime, String venueName,
		                 int totalSeats,int availableSeats, double ticketPrice, EventType eventType) {
		        this.eventName = eventName;
		        this.eventDate = eventDate;
		        this.eventTime = eventTime;
		        this.venueName = venueName;
		        this.totalSeats = totalSeats;
		        this.availableSeats = totalSeats;
		        this.ticketPrice = ticketPrice;
		        this.eventType = eventType;
		    }

		   
		    public String getEventName() {
		        return eventName;
		    }

		    public void setEventName(String eventName) {
		        this.eventName = eventName;
		    }

		    public LocalDate getEventDate() {
		        return eventDate;
		    }

		    public void setEventDate(LocalDate eventDate) {
		        this.eventDate = eventDate;
		    }

		    public LocalTime getEventTime() {
		        return eventTime;
		    }

		    public void setEventTime(LocalTime eventTime) {
		        this.eventTime = eventTime;
		    }

		    public String getVenueName() {
		        return venueName;
		    }

		    public void setVenueName(String venueName) {
		        this.venueName = venueName;
		    }

		    public int getTotalSeats() {
		        return totalSeats;
		    }

		    public void setTotalSeats(int totalSeats) {
		        this.totalSeats = totalSeats;
		    }

		    public int getAvailableSeats() {
		        return availableSeats;
		    }

		    public void setAvailableSeats(int availableSeats) {
		        this.availableSeats = availableSeats;
		    }

		    public double getTicketPrice() {
		        return ticketPrice;
		    }

		    public void setTicketPrice(double ticketPrice) {
		        this.ticketPrice = ticketPrice;
		    }

		    public EventType getEventType() {
		        return eventType;
		    }

		    public void setEventType(EventType eventType) {
		        this.eventType = eventType;
		    }

		   

		    public double calculateTotalRevenue(int numTickets) {
		        return ticketPrice*numTickets;
		    }

		    public int getBookedNoOfTickets() {
		        return totalSeats - availableSeats;
		    }

		    public void bookTickets(int numTickets) {
		        if (availableSeats >= numTickets) {
		            availableSeats -= numTickets;
		            System.out.println(numTickets + " tickets booked successfully for " + eventName);
		        } else {
		            System.out.println("Not enough available seats for " + eventName);
		        }
		    }

		    public void cancelBooking(int numTickets) {
		        availableSeats += numTickets;
		        System.out.println(numTickets + " tickets canceled for " + eventName);
		    }

		    public void displayEventDetails() {
		        System.out.println("Event Name: " + eventName);
		        System.out.println("Date: " + eventDate);
		        System.out.println("Time: " + eventTime);
		        System.out.println("Venue: " + venueName);
		        System.out.println("Total Seats: " + totalSeats);
		        System.out.println("Available Seats: " + availableSeats);
		        System.out.println("Ticket Price: " + ticketPrice);
		        System.out.println("Event Type: " + eventType);
		    }

		    @Override
		    public String toString() {
		        return "Event{" +
		                "eventName='" + eventName + '\'' +
		                ", eventDate=" + eventDate +
		                ", eventTime=" + eventTime +
		                ", venueName='" + venueName + '\'' +
		                ", totalSeats=" + totalSeats +
		                ", availableSeats=" + availableSeats +
		                ", ticketPrice=" + ticketPrice +
		                ", eventType=" + eventType +
		                '}';
		    } 
		

	    // Abstract method
	    public abstract void abstractMethod();

	    
	}

	abstract class Movie extends Event {
		 private String genre;
		    private String actorName;
		    private String actressName;

		    public Movie() {
		        // Default constructor
		        setEventType(EventType.MOVIE);
		    }

		    public Movie(String eventName, LocalDate eventDate, LocalTime eventTime, String venueName,
		                 int totalSeats,int availableSeats, double ticketPrice, String genre, String actorName, String actressName) {
		        super(eventName, eventDate, eventTime, venueName, totalSeats,availableSeats, ticketPrice, EventType.MOVIE);
		        this.genre = genre;
		        this.actorName = actorName;
		        this.actressName = actressName;
		    }

		    // Getter and setter methods

		    public String getGenre() {
		        return genre;
		    }

		    public void setGenre(String genre) {
		        this.genre = genre;
		    }

		    public String getActorName() {
		        return actorName;
		    }

		    public void setActorName(String actorName) {
		        this.actorName = actorName;
		    }

		    public String getActressName() {
		        return actressName;
		    }

		    public void setActressName(String actressName) {
		        this.actressName = actressName;
		    }

		   
		    // Overriding display method
		    @Override
		    public void displayEventDetails() {
		        super.displayEventDetails();
		        System.out.println("Genre: " + genre);
		        System.out.println("Actor: " + actorName);
		        System.out.println("Actress: " + actressName);
		    
		} 

	    public void abstractMethod() {
	        // Implement abstract method in Movie class
	    }
	}

	abstract class Concert extends Event {
		 private String artist;
		    private String type;

		    public Concert() {
		        // Default constructor
		        setEventType(EventType.CONCERT);
		    }

		    public Concert(String eventName, LocalDate eventDate, LocalTime eventTime, String venueName,
		                   int totalSeats,int availableSeats, double ticketPrice, String artist, String type) {
		        super(eventName, eventDate, eventTime, venueName, totalSeats,availableSeats, ticketPrice, EventType.CONCERT);
		        this.artist = artist;
		        this.type = type;
		    }

		    // Getter and setter methods

		    public String getArtist() {
		        return artist;
		    }

		    public void setArtist(String artist) {
		        this.artist = artist;
		    }

		    public String getType() {
		        return type;
		    }

		    public void setType(String type) {
		        this.type = type;
		    }
		   
		    // Overriding display method
		    @Override
		    public void displayEventDetails() {
		        super.displayEventDetails();
		        System.out.println("Artist: " + artist);
		        System.out.println("Type: " + type);
		    }

		    // Additional method specific to Concert
		    public void displayConcertDetails() {
		        System.out.println("Concert Details: ");
		        displayEventDetails();
		    }
		
	    @Override
	    public void abstractMethod() {
	        // Implement abstract method in Concert class
	    }
	}

	class Sports extends Event {
		private String sportName;
	    private String teamsName;

	    public Sports() {
	        // Default constructor
	        setEventType(EventType.SPORTS);
	    }

	    public Sports(String eventName, LocalDate eventDate, LocalTime eventTime, String venueName,
	                  int totalSeats,int availableSeats, double ticketPrice, String sportName, String teamsName) {
	        super(eventName, eventDate, eventTime, venueName, totalSeats,availableSeats, ticketPrice, EventType.SPORTS);
	        this.sportName = sportName;
	        this.teamsName = teamsName;
	    }

	    // Getter and setter methods

	    public String getSportName() {
	        return sportName;
	    }

	    public void setSportName(String sportName) {
	        this.sportName = sportName;
	    }

	    public String getTeamsName() {
	        return teamsName;
	    }

	    public void setTeamsName(String teamsName) {
	        this.teamsName = teamsName;
	    }

	   
	    // Overriding display method
	    @Override
	    public void displayEventDetails() { 
	        super.displayEventDetails();
	        System.out.println("Sport: " + sportName);
	        System.out.println("Teams: " + teamsName);
	    }

	    // Additional method specific to Sports
	    public void displaySportDetails() {
	        System.out.println("Sport Details: ");
	        displayEventDetails();
	    } 

	    @Override
	    public void abstractMethod() {
	        // Implement abstract method in Sports class
	    }
	}

	abstract class TicketBookingSystem {

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
 
	 
}
