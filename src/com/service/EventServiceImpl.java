package com.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.model.Event;
import com.util.CommonConstants;
import com.util.CommonUtil;
import com.util.DBConnectionUtil;
import com.util.QueryUtil;


public class EventServiceImpl implements IEventService {
	public static final Logger log = Logger.getLogger(EventServiceImpl.class.getName());

	private static Connection connection;
	
	private static Statement statement;

	private PreparedStatement preparedStatement;

	@Override
	public void addEvent(Event event) {

		String eventID = CommonUtil.generateIDs(getEventIDs());
		
		try {
			connection = DBConnectionUtil.getDBConnection();
			/*
			 * Query is available in EventQuery.xml file and use
			 * insert_event key to extract value of it
			 */
			preparedStatement = connection
					.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_INSERT_EVENTS));
			connection.setAutoCommit(false);
			
			//Generate event IDs
			event.setEventID(eventID);
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, event.getEventID());
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_TWO, event.getEventName());
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_THREE, event.getDate());
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_FOUR, event.getDescription());
			// Add event
			preparedStatement.execute();
			connection.commit();

		} catch (SQLException | SAXException | IOException | ParserConfigurationException | ClassNotFoundException e) {
			log.log(Level.SEVERE, e.getMessage());
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end of
			 * transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}
	}
	private ArrayList<String> getEventIDs() {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();
		/*
		 * List of event IDs will be retrieved from EventQuery.xml
		 */
		try {
			connection = DBConnectionUtil.getDBConnection();
			preparedStatement = connection
					.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_GET_EVENT_IDS));
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				arrayList.add(resultSet.getString(CommonConstants.COLUMN_INDEX_ONE));
			}
		} catch (SQLException | SAXException | IOException | ParserConfigurationException
				| ClassNotFoundException e) {
			log.log(Level.SEVERE, e.getMessage());
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end of
			 * transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}
		return arrayList;
	}
	/**
	 * Event details can be retrieved based on the provided event ID
	 */
	@Override
	public Event getEventByID(String eventID) {

		return actionOnEvent(eventID).get(0);
	}
	/**
	 * Get all list of events
	 */
	@Override
	public ArrayList<Event> getEvents() {
		
		return actionOnEvent(null);
	}
	private ArrayList<Event> actionOnEvent(String eventID) {
		// TODO Auto-generated method stub
		ArrayList<Event> eventList = new ArrayList<Event>();
		try {
			connection = DBConnectionUtil.getDBConnection();
			/*
			 * Before fetching event it checks whether event ID is
			 * available
			 */
			if (eventID != null && !eventID.isEmpty()) {
				/*
				 * Get event by ID query will be retrieved from
				 * EventQuery.xml
				 */
				preparedStatement = connection
						.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_GET_EVENT));
				preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, eventID);
			}
			/*
			 * If event ID is not provided for get event option it display
			 * all events
			 */
			else {
				preparedStatement = connection
						.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_ALL_EVENTS));
			}
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Event event = new Event();
				event.setEventID(resultSet.getString(CommonConstants.COLUMN_INDEX_ONE));
				event.setEventName(resultSet.getString(CommonConstants.COLUMN_INDEX_TWO));
				event.setDate(resultSet.getString(CommonConstants.COLUMN_INDEX_THREE));
				event.setDescription(resultSet.getString(CommonConstants.COLUMN_INDEX_FOUR));
				eventList.add(event);
			}

		} catch (SQLException | SAXException | IOException | ParserConfigurationException | ClassNotFoundException e) {
			log.log(Level.SEVERE, e.getMessage());
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end of
			 * transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}
		return eventList;
	}
	@Override
	public void removeEvent(String eventID) {

		// Before deleting check whether event ID is available
		if (eventID != null && !eventID.isEmpty()) {
			/*
			 * Remove event query will be retrieved from EventQuery.xml
			 */
			try {
				connection = DBConnectionUtil.getDBConnection();
				preparedStatement = connection
						.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_REMOVE_EVENT));
				preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, eventID);
				preparedStatement.executeUpdate();
			} catch (SQLException | SAXException | IOException | ParserConfigurationException
					| ClassNotFoundException e) {
				log.log(Level.SEVERE, e.getMessage());
			} finally {
				/*
				 * Close prepared statement and database connectivity at the end
				 * of transaction
				 */
				try {
					if (preparedStatement != null) {
						preparedStatement.close();
					}
					if (connection != null) {
						connection.close();
					}
				} catch (SQLException e) {
					log.log(Level.SEVERE, e.getMessage());
				}
			}
		}
	}
	@Override
	public Event updateEvent(String eventID, Event event) {

		/*
		 * Before fetching event it checks whether event ID is available
		 */
		if (eventID != null && !eventID.isEmpty()) {
			/*
			 * Update event query will be retrieved from EventQuery.xml
			 */
			try {
				connection = DBConnectionUtil.getDBConnection();
				preparedStatement = connection
						.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_UPDATE_EVENT));
				preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, event.getEventName());
				preparedStatement.setString(CommonConstants.COLUMN_INDEX_TWO, event.getDate());
				preparedStatement.setString(CommonConstants.COLUMN_INDEX_THREE, event.getDescription());
				preparedStatement.setString(CommonConstants.COLUMN_INDEX_FOUR, event.getEventID());
				preparedStatement.executeUpdate();

			} catch (SQLException | SAXException | IOException | ParserConfigurationException
					| ClassNotFoundException e) {
				log.log(Level.SEVERE, e.getMessage());
			} finally {
				/*
				 * Close prepared statement and database connectivity at the end
				 * of transaction
				 */
				try {
					if (preparedStatement != null) {
						preparedStatement.close();
					}
					if (connection != null) {
						connection.close();
					}
				} catch (SQLException e) {
					log.log(Level.SEVERE, e.getMessage());
				}
			}
		}
		// Get the updated event
		return getEventByID(eventID);
	}
	
}
