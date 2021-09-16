package com.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.model.Admin;
import com.util.AdminQueryUtil;
import com.util.CommonConstants;
import com.util.DBConnectionUtil;


public class AdminServiceImpl implements AdminService {
	public static final Logger log = Logger.getLogger(AdminServiceImpl.class.getName());

	private static Connection connection;

	private PreparedStatement preparedStatement;
	
	@Override
	public Admin login(String userName, String password) {
		Admin a = new Admin();
		try {
			connection = DBConnectionUtil.getDBConnection();
			preparedStatement = connection
					.prepareStatement(AdminQueryUtil.queryByID(CommonConstants.QUERY_ID_LOGIN_ADMIN));
			
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, userName);
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_TWO, password);

			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				a.setAdminID(rs.getString(1));
				a.setName(rs.getString(2));
				a.setEmail(rs.getString(3));
				a.setUserName(rs.getString(4));
				a.setPassword(rs.getString(5));	
			}

		} catch (SQLException | SAXException | IOException | ParserConfigurationException
				| ClassNotFoundException e) {
			log.log(Level.SEVERE, e.getMessage());
		} finally {
			
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
		return a;
	}
}