package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ToExecuteQuerry {

	public static void main(String[] args) throws SQLException {
		//1. Creating an object of Driver of MY SQL vendor
		Driver dataBaseDriver = new Driver();
		//2. Registering driver to JDBC API
		DriverManager.registerDriver(dataBaseDriver);
		//3. Establishing connection with the data base
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
		//4. creating statement to pass the select query
		Statement statement = connection.createStatement();
		
		ResultSet result = statement.executeQuery("select * from lead;");
		//5. Fetching the data from the data base
		while(result.next()) {
			System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3));
	
		}
		
		
		
		
		

	}

}
