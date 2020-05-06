package datadriven.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_SQL_Connection {

	public static void main(String[] args) throws Exception 
	{
		
		//Connection string for JDBC
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		String BD_Address="jdbc:sqlserver://localhost:";
		String Username="Sunil";
		String Password="Hello";
		
		//Connection for database.
		Connection con=DriverManager.getConnection(BD_Address, Username, Password);
		
		//Decision to verify connection
		if(con!=null)
		{
			//Create New Statement
			Statement Stmt1=con.createStatement();
			
			//Execute query using New Statement [This syntax run query and return set of records inot resultset]
			ResultSet RS=Stmt1.executeQuery("SELECT * FROM Customers;");
			
			
			//Write Conditional loop inorder to read all Records
			while(RS.next())
			{
					String Cname=RS.getString("CustomerName");
					System.out.println(Cname);
					
					if(Cname.trim().equals("Sunil"))
					{
						System.out.println("Record available");
					}
					
					String City=RS.getString("City");
					System.out.println(City);
			}
			
		}
		else
			System.out.println("Database connection failed");
		

	}

}
