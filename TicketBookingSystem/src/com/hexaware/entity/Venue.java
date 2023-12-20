package com.hexaware.entity;

 class Venue {
    private String venueName;
    private String address;

    public Venue() {
        this.venueName="default";
        this.address="default";
        
    }

    public Venue(String venueName, String address) {
        this.venueName = venueName;
        this.address = address;
    }

    

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getAddress() {
        return address;
    } 

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayVenueDetails() {
        System.out.println("Venue Name: " + venueName);
        System.out.println("Address: " + address);
    }
    @Override
    public String toString() {
        return "Venue{" +
                "venueName='" + venueName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
