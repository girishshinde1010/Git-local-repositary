package com.regester.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ForgotPassword {
	public void forgotPassword() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your username");
		String username = sc.next();
		System.out.println("Enter your gmail");
		String gmail = sc.next();
		Connection connection = ConnectionTest.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("select * from UserLoginDetails ");
			ResultSet rs = ps.executeQuery();
			int count =0;
			while (rs.next()) {
				if (rs.getString(3).equals(username) && rs.getString(6).equals(gmail)) {
					System.out.println("Here is your password>> " + rs.getString(4));					
					count++;										
					break;
				} 
			}
			if (count>0){
				UserRejester ur = new UserRejester();
				ur.userLogin();									
				}else {
					throw new InvalidInputException("Invalid Username and Gmail");
				}
			
		} catch (Exception e) {

			e.printStackTrace();

		}
	}
}
