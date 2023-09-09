package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class ToExecuteUpdate {

	public static void main(String[] args) throws SQLException {
		// 1. Creating an object of Driver of MY SQL vendor
		Driver dataBaseDriver = new Driver();
		// 2. Registering driver to JDBC API
		DriverManager.registerDriver(dataBaseDriver);
		// 3. Establishing connection with the data base
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
		// 4. creating statement to pass the select query
		int result = connection.createStatement().executeUpdate("insert into lead values('Bhupendra', 'Singh', 'Qspiders')");
		
		if(result == 1) {
			System.out.println("Data base has been updated");
		}

		else
			System.out.println("Data base has not been updated");
		
		
		connection.close();

	}

}
