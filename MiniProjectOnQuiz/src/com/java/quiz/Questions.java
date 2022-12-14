package com.java.quiz;
import com.regester.login.ConnectionTest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Questions {
	

	public void quiz() {
	int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0;
	System.out.println("-----------------------------------------------------------------");
	System.out.println("                                                                 ");
    System.out.println("Important :- Enter all your Answers in the format 1, 2, 3, 4 only");
	System.out.println("                                                                 ");
	System.out.println("-----------------------------------------------------------------");


	Scanner sc = new Scanner(System.in);

	System.out.println(
			"Q.1 Which variables are created when an object is created with the use of the keyword 'new' and destroyed when the object is destroyed?");
	System.out.println(
			"Option 1 : Local variable \nOption 2 : Instance Variable \nOption 3 : Class Variable \nOption 4 : Static Variables");
     int correct=0;
     int wrong=0;
     int total=0;

	int aa = sc.nextInt();
	if (aa == 2) {
		a = 1;
		System.out.println("----Right Answer----");
		correct++;
	} else {
		a = 0;
		System.out.println("----Wrong Answer----");
		System.out.println("Right Answer is Option 2 : Instance Variable");
		wrong++;
	}
	System.out.println("                                                                                      ");
	System.out.println("--------------------------------------------------------------------------------------");


	

	System.out.println("Q.2 Data type long literals are appended by _");
	System.out.println(
			"Option 1 : Uppercase L \nOption 2 : Lowercase L \nOption 3 : Long \nOption 4 : both option  1 & 2");

	int bb = sc.nextInt();
	if (bb == 4) {
		b = 1;
		System.out.println("----Right Answer----");
		correct++;
	} else {
		b = 0;
		System.out.println("----Wrong Answer----");
		System.out.println("Right Answer is Option 4 : both option  1 & 2");
		wrong++;
	}
	System.out.println("                                                                                 ");
    System.out.println("---------------------------------------------------------------------------------");


	System.out.println("Q.3 Which of these is returned by operator '&' ?");
	System.out.println("Option 1 : integer \nOption 2 : Charachter\nOption 3 : boolean \nOption 4 : float");

	int cc = sc.nextInt();
	if (cc == 3) {
		c = 1;
		System.out.println("----Right Answer----");
		correct++;
	} else {
		c = 0;
		System.out.println("----Wrong Answer----");
		System.out.println("Right Answer is Option 3 : boolean");
		wrong++;
	}
	System.out.println("                                                                        ");
	System.out.println("------------------------------------------------------------------------");



	System.out.println("Q.4 Which of the following are not Java keywords ?");
	System.out.println("Option 1 : then \nOption 2 : switch \nOption 3 : boolean \nOption 4 : if");

	int dd = sc.nextInt();
	if (dd == 1) {
		d = 1;
		System.out.println("----Right Answer----");
		correct++;
	} else {
		d = 0;
		System.out.println("----Wrong Answer----");
		System.out.println("Right Answer is Option 1 : then");
		wrong++;
	}
	System.out.println("                                                                                                 ");
	System.out.println("-------------------------------------------------------------------------------------------------");

	System.out.println("Q.5 What is byte code in java ?");
	System.out.println("Option 1 : Code generated by a Java compiler \nOption 2 : Code generated by a Java Virtual Machine \nOption 3 : Name of Java source code file\n"+ "Option 4 : Block of code written inside a class" + "");
	
	int ee = sc.nextInt();
	if (ee == 1) {
		e = 1;
		System.out.println("----Right Answer----");
		correct++;
	} else {
		e = 0;
		System.out.println("----Wrong Answer----");
		System.out.println("Right Answer is Option 1 : Code generated by a Java compiler ");
		wrong++;
	}
	System.out.println("                                                                          ");
	System.out.println("--------------------------------------------------------------------------");
	
	System.out.println("Q.6 Which provides runtime environment for java byte code to be executed ?");
	System.out.println("Option 1 : JDK \nOption 2 : JVM \nOption 3 : JRE \nOption 4 : JavaC");
	
	int ff = sc.nextInt();
	if (ff == 2) {
		f = 1;
		System.out.println("----Right Answer----");
		correct++;
	} else {
		f = 0;
		System.out.println("----Wrong Answer----");
		System.out.println("Right Answer is Option 2 : JVM ");
		wrong++;
	}
	System.out.println("                                                                            ");
	System.out.println("----------------------------------------------------------------------------");
	
	System.out.println("Q.7 What is the default value of boolean data type ?");
	
	System.out.println("Option 1 : True \nOption 2 : False \nOption 3 : Null \nOption 4 : BlankSpace");
	
	int gg = sc.nextInt();
	if (gg == 2) {
		g = 1;
		System.out.println("----Right Answer----");
		correct++;
	} else {
		g = 0;
		System.out.println("----Wrong Answer----");
		System.out.println("Right Answer is Option 2 : False ");
		wrong++;
	}
	System.out.println("                                                                                                ");
	System.out.println("------------------------------------------------------------------------------------------------");
	
    System.out.println("Q.8 Who is known as father of Java Programming Language ?");
	
	System.out.println("Option 1 : James Gosling \nOption 2 : M.P Java \nOption 3 : Charles Babage \nOption 4 : D.k Java");
	
	int hh = sc.nextInt();
	if (hh == 1) {
		h = 1;
		System.out.println("----Right Answer----");
		correct++;
	} else {
		h = 0;
		System.out.println("----Wrong Answer----");
		System.out.println("Right Answer is Option 1 : James Gosling ");
		wrong++;
	}
	System.out.println("                                                                               ");
	System.out.println("-------------------------------------------------------------------------------");
	
	 System.out.println("Q.9 Which of the following is not a feature of java ?");
		
	 System.out.println("Option 1 : Portable \nOption 2 : Secure \nOption 3 : Speed \nOption 4 : Robust");
		
		int ii = sc.nextInt();
		if (ii == 3) {
			i = 1;
			System.out.println("----Right Answer----");
			correct++;
		} else {
			i = 0;
			System.out.println("----Wrong Answer----");
			System.out.println("Right Answer is Option 3 : Speed ");
			wrong++;
		}
		System.out.println("                                                                                                                                         ");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
		
		 System.out.println("Q.10 Which of the following is not a type of inheritance ?");
			
		 System.out.println("Option 1 : cyclone inheritance \nOption 2 : single inheritance \nOption 3 : multilevel inheritance \nOption 4 : Hierarchical inheritance");
			
			int jj = sc.nextInt();
			if (jj == 1) {
				j = 1;
				System.out.println("----Right Answer----");
				correct++;
			} else {
				j = 0;
				System.out.println("----Wrong Answer----");
				System.out.println("Right Answer is Option 1 : cyclone inheritance ");
				wrong++;
			}
			System.out.println("                                                   ");
			System.out.println("--------------*********--------------");
			System.out.println("---------|------------|");
			System.out.println("Correct  | "+correct+"          |" );
			System.out.println("---------|------------|");
			System.out.println("Wrong    | "+wrong+"          |" );
			System.out.println("---------|------------|");
			//System.out.println("Total marks      "+correct+"   ");
			if(correct==10) {
				System.out.println("Congratulation you Done well");
				System.out.println("You get "+correct+" out of 10 " );
			}else if(correct==0) {
				System.out.println("You failed ");
				System.out.println("You get "+correct+" out of 10 " );
			}else if(correct>0 && correct<5) {
				System.out.println("You get "+correct+" out of 10 ");
					System.out.println("You have to study more");
				}
			else {
				System.out.println("You get "+correct+" out of 10 ");
				System.out.println("Good");
			}
			
			
		/*	try {
				
				PreparedStatement ps = connection.prepareStatement("insert into userScore(correct,wrong,total)values(?,?,?)");
				ps.setInt(1,correct );
				ps.setInt(2, wrong);
				ps.setInt(3, total);
				ps.execute();
			//	System.out.println("inserted successfully");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("--------------Here is your quiz details list --------------");
			
			try {
				PreparedStatement ps =connection.prepareStatement("select Name from userlogindetails left join  userScore on userlogindetails.userId=userScore.userId");
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getString(1));
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}*/
	
			 
			 

	}			
			
	

	Connection connection =ConnectionTest.getConnection();		
}


