import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;


public class Airport {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a;
		do {
		// TODO Auto-generated method stub
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","Sonumonu@3462");
		Statement st=con.createStatement();
		 System.out.println("Connection Established");
		 System.out.println(" ");
		 System.out.println("Enter the Airport Code");
		 String Airport_code=sc.next();
		 System.out.println("Enter the Airport Name");
		 String Airport_name=sc.next();
		 System.out.println("Enter the city");
		 String city=sc.next();
		 System.out.println("Enter the Country");
		 String country=sc.next();
		st.executeUpdate("insert into airport value('"+Airport_code+"','"+Airport_name+"','"+city+"','"+country+"')");
		System.out.println("Data Entered Successfully"); 
		System.out.println("");
		}
		catch(Exception e) {
			System.out.println("error");
		}
		System.out.println("Do You Want Add More Data yes/no");
	    a=sc.next();
		}while(a.equalsIgnoreCase("yes"));
		System.out.println("Thankyou");
	}

}
