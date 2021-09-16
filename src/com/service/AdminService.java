package com.service;

import java.util.logging.Logger;

import com.model.Admin;


public interface AdminService {
public static final Logger log = Logger.getLogger(AdminService.class.getName());
	
	public Admin login(String userName, String password);
}
