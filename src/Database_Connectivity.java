
import java.sql.*; //import SQL-functions 

public class Database_Connectivity {

	public static void main(String[] args){
		
		try{
			
			// initialize Driver
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			// database connection ("URL or Path of the database", "User", "password")
			Connection databaseConnection = DriverManager.getConnection("jdbc:mysql://localhost/ePortfolio","root","");
						
			//TODO Connection setReadOnly
			
			//TODO Objects
			
			//TODO execute SQL-Command
		}
		
		//TODO close procedures
		
		catch(Exception e){
			
			// failure message
			System.out.println(" **** FAILURE **** " + e);
		}
	}
	
}
