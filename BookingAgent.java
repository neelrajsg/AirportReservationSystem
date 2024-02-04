import java.sql.*;
import java.util.Scanner;
public class BookingAgent {

	public static void main(String[] args) {
		String a;
		Scanner sc=new Scanner(System.in);
		do{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","Sonumonu@3462");
				Statement st=con.createStatement();
				System.out.println("Connection Established With Database");
				System.out.println("Enter The Agent_id");
				int agent_id=sc.nextInt();
				System.out.println("Enter the Agent Name");
				String name=sc.next();
				st.executeUpdate("insert into booking_agent values('"+agent_id+"','"+name+"')");
				System.out.println("Data Inserted SuccessFully");
			}catch(Exception e) {
				System.out.println("Error Check");
			}
			System.out.println("Do You Want Add More Data yes/no");
		    a=sc.next();
		}while(a.equalsIgnoreCase("yes"));
		System.out.println("Thankyou");
		

	}

}
