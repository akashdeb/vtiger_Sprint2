import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseUtility {

    public String fetchDataFromDataBase(Connection connection, String sqlQuery, int index) throws SQLException {
        if (connection == null) {
            throw new IllegalArgumentException("Connection cannot be null.");
        }

        if (sqlQuery == null || sqlQuery.isEmpty()) {
            throw new IllegalArgumentException("SQL query is null or empty.");
        }

        Statement statement = connection.createStatement();
        if (statement == null) {
            throw new SQLException("Failed to create a statement.");
        }

        ResultSet result = statement.executeQuery(sqlQuery);

        if (result.next()) {
            return result.getString(index);
        } else {
            System.out.println("No data found for the given SQL query.");
            return "";
        }
    }

    public void updateDataInDataBase(Connection connection, String sqlQuery) throws SQLException {
        if (connection == null) {
            throw new IllegalArgumentException("Connection cannot be null.");
        }

        if (sqlQuery == null || sqlQuery.isEmpty()) {
            throw new IllegalArgumentException("SQL query is null or empty.");
        }

        Statement statement = connection.createStatement();
        if (statement == null) {
            throw new SQLException("Failed to create a statement.");
        }

        int result = statement.executeUpdate(sqlQuery);

        if (result == 1) {
            System.out.println("The database has been updated.");
        } else {
            System.out.println("The database has not been updated.");
        }
    }
}
