package com.regester.login;

import java.sql.SQLException;

public interface  User{
	
	public abstract  void registerUserDetail(String Name, String userName, String userPassword, 
			                                                      String userCity, String gmail);
    
	public abstract void rejestration() throws SQLException;
	
	public abstract void userLogin();
	
    
		
	
	
} 
