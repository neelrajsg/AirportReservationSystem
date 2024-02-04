import java.sql.*;
import java.util.Scanner;
public class Flightdata {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a;
	
	do {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","Sonumonu@3462");
			Statement st=con.createStatement();
			System.out.println("Connection Established With Database");
			System.out.println("Enter the Flight Number");
			int flight_number=sc.nextInt();
			System.out.println("Enter the  Airline Name");
			String airline_name=sc.next();
			System.out.println("Enter the Arrival Time");
			String arrival_time=sc.next();
			System.out.println("Enter the Departure Time");
			String departure=sc.next();
			System.out.println("Enter the Source Location");
			String from_location=sc.next();
			System.out.println("Enter the Destination Location");
			String to_destination=sc.next();
			System.out.println("Enter the Duration");
			int duration=sc.nextInt();
			st.executeUpdate("insert into flightdata values('"+flight_number+"','"+airline_name+"','"+arrival_time+"','"+departure+"','"+from_location+"','"+to_destination+"','"+duration+"')");
			
		}catch(Exception e) {
			System.out.println("Erro-Please debug the code");
			
		}
		System.out.println("Do You Want Add More Data yes/no");
	    a=sc.next();
	
	}while(a.equalsIgnoreCase("yes"));
	System.out.println("Thankyou");

}
}
