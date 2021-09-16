package com.service;

import java.util.ArrayList;
import java.util.logging.Logger;

import com.model.Event;

public interface IEventService {
public static final Logger log = Logger.getLogger(IEventService.class.getName());
	
	public void addEvent(Event event);
	
	public Event  getEventByID(String eventID);
	
	public ArrayList<Event> getEvents();
	
	public Event updateEvent(String eventID, Event event);
	
	public void removeEvent(String eventID);
}
