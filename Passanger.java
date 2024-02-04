import java.sql.*;
import java.util.Scanner;
public class Passanger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a;
		do {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","Sonumonu@3462");
			Statement st=con.createStatement();
			System.out.println("Connection Established");
			System.out.println("Enter the passenger id");
			int pass_id=sc.nextInt();
			System.out.println("Enter the First_name");
			String first_name=sc.next();
			System.out.println("Enter the Second_nameS");
			String second_name=sc.next();
			System.out.println("Enter the last_name");
			String last_name=sc.next();
			System.out.println("Enter the age");
			int age=sc.nextInt();
			System.out.println("Enter the Country");
			String country=sc.next();
			System.out.println("Enter the city");
			String city=sc.next();
			System.out.println("Enter the email_address");
			String email_adress=sc.next();
			System.out.println("Enter the phone no");
			int phone_no=sc.nextInt();
			System.out.println("Enter the Address");
			String Address=sc.next();
			st.executeUpdate("insert into passenger values('"+pass_id+"','"+first_name+"','"+second_name+"','"+last_name+"','"+age+"','"+country+"','"+city+"','"+email_adress+"','"+phone_no+"','"+Address+"')");
			System.out.println("Data Inserted Successfully");
			System.out.println("");
			
		}catch(Exception e) {
			System.out.println("Error:Check the Code ");
		}
		System.out.println("Do You Want Add More Data yes/no");
	    a=sc.next();
		}while(a.equalsIgnoreCase("yes"));
		System.out.println("Thankyou");
		
      
	}

}
