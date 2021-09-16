package com.util;

public class CommonConstants {

	/** Constant for config.properties key for query file path */
	public static final String QUERY_XML = "queryFilePath";

	/** Constant for file path of config.properties */
	public static final String PROPERTY_FILE = "config.properties";

	/** Constant for query tag in EventQuery.xml */
	public static final String TAG_NAME = "query";

	/** Constant for query id in EventQuery.xml */
	public static final String ATTRIB_ID = "id";
	
	/** Constant for event id prefix */
	public static final String EVENT_ID_PREFIX = "E0";

	/** Constant for comma */
	public static final String COMMA = ",";

	/** Constant for url key of MySQL database in config.properties */
	public static final String URL = "url";

	/** Constant for user name key of MySQL database in config.properties */
	public static final String USERNAME = "username";

	/** Constant for password key of MySQL database in config.properties */
	public static final String PASSWORD = "password";

	/** Constant for driver name key of MySQL database in config.properties */
	public static final String DRIVER_NAME = "driverName";

	/** Constant for query id of drop_table in EventQuery.xml */
	public static final String QUERY_ID_DROP_TABLE = "drop_table";

	/** Constant for query id of create_table in EventQuery.xml */
	public static final String QUERY_ID_CREATE_TABLE = "create_event_table";

	/** Constant for query id of insert events in EventQuery.xml */
	public static final String QUERY_ID_INSERT_EVENTS = "insert_event";

	/** Constant for query id of get an event in EventQuery.xml */
	public static final String QUERY_ID_GET_EVENT = "event_by_id";

	/** Constant for query id of get all events in EventQuery.xml */
	public static final String QUERY_ID_ALL_EVENTS = "all_events";

	/** Constant for query id of remove a event in EventQuery.xml */
	public static final String QUERY_ID_REMOVE_EVENT = "remove_event";

	/** Constant for query id of update a event in EventQuery.xml */
	public static final String QUERY_ID_UPDATE_EVENT = "update_event";

	/** Constant for query id of get all event ids in EventQuery.xml */
	public static final String QUERY_ID_GET_EVENT_IDS = "event_ids";
	
	
	/**
	 * Admin Query List
	 * Retrieve from AdminQuery.xml
	 */
	/** Constant for query id of get all Item ids in ItemQuery.xml */
	public static final String QUERY_ID_GET_ADMIN_IDS = "admin_ids";
	
	/** Constant for Person id prefix */
	public static final String ADMIN_ID_PREFIX = "A0";
	
	/** Constant for query id of update person in PersonQuery.xml */
	public static final String QUERY_ID_LOGIN_ADMIN = "admin_login";
	
	/**
	 * End of person query list
	 */
	
	/** Constant for Column index one */
	public static final int COLUMN_INDEX_ONE = 1;
	
	/** Constant for Column index two */
	public static final int COLUMN_INDEX_TWO = 2;
	
	/** Constant for Column index three */
	public static final int COLUMN_INDEX_THREE = 3;
	
	/** Constant for Column index four */
	public static final int COLUMN_INDEX_FOUR = 4;
	
	/** Constant for Column index five */
	public static final int COLUMN_INDEX_FIVE = 5;
	
	/** Constant for Column index six */
	public static final int COLUMN_INDEX_SIX = 6;
	
	/** Constant for Column index seven */
	public static final int COLUMN_INDEX_SEVEN = 7;
	
	/** Constant for Column index eight */
	public static final int COLUMN_INDEX_EIGHT = 8;
}
