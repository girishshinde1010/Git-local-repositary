package com.regester.login;

import java.sql.SQLException;
import java.util.Scanner;

public class MainTest {

	UserRejester ur = new UserRejester();
	Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		MainTest mt = new MainTest();
		mt.mainTest();
	}

	public void mainTest() {
		System.out.println("Are you new user Please response with only yes or no");
		String option1 = "yes";
		String option2 = "no";
		String user = sc.next();		
		if (user.equals(option1)) {
			try {
				ur.rejestration();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if (user.equals(option2)) {
			ur.userLogin();
		} else {
			System.out.println("\nInvalid input please select only yes or no");
			this.mainTest();
		}
	}

}
