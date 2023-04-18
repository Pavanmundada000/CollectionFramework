package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {
	
public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connnection= DriverManager.getConnection("jdbc:mysql://localhost:3306/sham", "root","root");
			
			if(connnection.isClosed())
			{
				System.out.println("coonection closed");
			}
			else
			{
				System.out.println("connection created");
			}
			
			
			
		} catch (Exception e) {
			
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}

