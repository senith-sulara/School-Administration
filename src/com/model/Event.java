package com.model;


public class Event {
	private String eventID;
	
	private String eventName;

	private String date;

	private String description;

		
	public String getEventID() {
		return eventID;
	}


	public void setEventID(String eventID) {
		this.eventID = eventID;
	}


	public String getEventName() {
		return eventName;
	}


	public void setEventName(String eventName) {
		this.eventName = eventName;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		
		return "Event ID = " + eventID + "\n" + "Event Name = " + eventName + "\n" + "Date = " + date + "\n"
				+ "About = " + description ;
	}
}
