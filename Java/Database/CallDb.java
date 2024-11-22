package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CallDb {
    public void signup() {
        try {
            String url = "jdbc:mysql://localhost:3306/customer"; // Address of database
            String username = "root"; // Username to access the Database
            String password = "8920611534"; // Password to access the Database

            Connection con = DriverManager.getConnection(url, username, password); // Establish the Connection

            String query = "INSERT INTO student (first_name, email, phone_no) VALUES (?, ?, ?)";
            
            PreparedStatement st = con.prepareStatement(query);
            
            st.setString(1, "siting");
            st.setString(2, "nitin@example.com");
            st.setString(3, "758474");

            int rowsAffected = st.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted.");

            st.close();

            /* This line closes the Connection object (con) to release any resources associated with it and to terminate the connection to the database. */
            con.close();
        } catch (Exception e) {
            System.out.println("Error occurred:");
            e.printStackTrace();
        }
    }

    public PreparedStatement prepareStatement(String query) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Get the database connection
            connection = DriverManager.getConnection("your_database_url", "username", "password");

            // Prepare the statement
            preparedStatement = connection.prepareStatement(query);

            // Return the prepared statement
            return preparedStatement;
        } catch (SQLException e) {
            // Handle any SQL errors
            e.printStackTrace();

            // Rethrow the exception
            throw e;
        } finally {
            // Close the resources
            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (connection != null) {
                connection.close();
            }
        }
    }

}
