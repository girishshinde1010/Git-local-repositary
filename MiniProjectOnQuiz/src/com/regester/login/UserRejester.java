package com.regester.login;
import com.java.quiz.Questions;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserRejester extends Exception implements User {
	
	@Override
	public void registerUserDetail(String Name, String userName, String userPassword, String userCity, String gmail) {
		Connection connection = ConnectionTest.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement(
					"insert into userlogindetails(Name,userName,userPassword,userCity,gmail)values(?,?,?,?,?)");
			ps.setString(1, Name);
			ps.setString(2, userName);
			ps.setString(3, userPassword);
			ps.setString(4, userCity);
			ps.setString(5, gmail);
			ps.execute();
			System.out.println("\nYou have successfully regester...");

		} catch (Exception e) {

			e.printStackTrace();
		}
		this.userLogin();
	}

	public void rejestration() throws SQLException {
		UserRejester mt = new UserRejester();
		String Name, userName, userPassword, userCity, gmail;
		Scanner sc = new Scanner(System.in);
		System.out.println("            Fill up the following regestration form as below");
		System.out.println("Please enter your name");
		Name = sc.next();
		System.out.println("Please enter your user name");
		userName = sc.next();
		Connection connection = ConnectionTest.getConnection();
		PreparedStatement ps = connection.prepareStatement("select * from UserLoginDetails ");
		ResultSet rs = ps.executeQuery();
		int count = 0;
		int res = 0;
		while (rs.next()) {
			if (rs.getString(3).equals(userName)) {
				count++;
			}
			if (count >= 1) {
				System.out.println("This username has already taken");
				System.out.println("Please enter your user name");
				userName = sc.next();
				if (userName != rs.getString(3)) {
					res++;
				}
				if (res == 1) {
					break;
				}
			}
		}
		System.out.println("Please enter your password");
		userPassword = sc.next();
		System.out.println("Please enter your city");
		userCity = sc.next();
		System.out.println("Please enter your gmail");
		gmail = sc.next();
		mt.registerUserDetail(Name, userName, userPassword, userCity, gmail);

	}
	
	public void userLogin() {
		Connection connection = ConnectionTest.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("select * from UserLoginDetails ");
			ResultSet rs = ps.executeQuery();
			Scanner scanner = new Scanner(System.in);
			System.out.println("\nPlease login to give java quiz test");
			System.out.println("Enter your  user name ");
			String username = scanner.next();
			System.out.println("Enter your password");
			String password = scanner.next();
			int count=0;
			while(rs.next()) {
				//System.out.println("username "+rs.getString(3)+"pass "+rs.getString(4));
				if (rs.getString(3).equals(username) && rs.getString(4).equals(password)) {					
					count++;					
					break;
				}
			}if(count >0) {
				System.out.println("You have succesfully login\nAll the best");
				Questions q =new Questions();
				q.quiz();
			}
				else {
					System.out.println("\ninvalid username and password...");
					System.out.println("Are you forgot your password");
					ForgotPassword fw = new ForgotPassword();
					fw.forgotPassword();
				}
	
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
