
import java.sql.*; //import SQL-functions 

public class Database_Connectivity {

	public static void main(String[] args){
		
		try{
			
			//initialize Driver
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			
		}
		
		catch(){
			
			//TODO failure message
		}
	}
	
}
