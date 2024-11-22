package Database;
import java.sql.*;

public class DB {

    public void signup(String name, String emailId, int phone) {
        try {
        /* This line declares a string variable url and assigns it the URL required to establish a connection to the MySQL database.
        The URL format is specific to the MySQL database, and it includes the host (localhost), port number (3306), and the database name.*/
            String url = "jdbc:mysql://Localhost:3306/customer";
            String username = "root"; // Username to access the Database
            String password = "8920611534"; // Password to access the Database


        /* This line loads and registers the MySQL JDBC driver class (com.mysql.cj.jdbc.Driver).
        By calling Class.forName(), the JVM loads the specified class into memory and registers it with the DriverManager class.
        This step is necessary to establish a connection to the MySQL database.*/
//        Class.forName("com.mysql.cj.jdbc.Driver"); // Load and Register the driver


        /* This line establishes a connection to the MySQL database using the provided URL, username, and password.
        The DriverManager.getConnection() method is called with the connection URL, username, and password as arguments.
        It returns a Connection object that represents the established connection.*/
            Connection con = DriverManager.getConnection(url, username, password); // Establish the Connection


        /* This line creates a Statement object (st) using the createStatement() method of the Connection object.
        The Statement object is used to execute SQL statements against the database.*/
            Statement st = con.createStatement();



//            String query1 = "INSERT INTO custo_details (id,first_name, last_name, email, phone_no) VALUES (?,?,?,?,?,?) ";
//            String query1 = "INSERT INTO custo_details (first_name, last_name, email, gender, phone_no) VALUES (?,?,?,?,?)";
//
//
//            PreparedStatement st1 = con.prepareStatement(query1);
//            st1.setString(2,firstName);
//            st1.setString(3,lastName);
//            st1.setString(4,emailId);
//            st1.setString(5,gender);
//            st1.setLong(6,phone);

            String query1 = "INSERT INTO student (name, email, phone_no) VALUES (?,?,?)";
            PreparedStatement st1 = con.prepareStatement(query1);
            st1.setString(1, name);
            st1.setString(2, emailId);
            st1.setInt(3, phone);


            int rowsAffected = st1.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted.");

            st1.executeUpdate(query1);
            st1.close();







            // Print data




        /* This line declares a string variable query and assigns it an SQL SELECT statement.
        The statement selects all records (*) from the "custo_deatils" table in the database.*/
//          String query = "SELECT * FROM customer.custo_details ORDER BY first_name ASC";
//
//        /* This line executes the SQL SELECT statement stored in the query variable using the executeQuery() method of the Statement object (st).
//        It returns a ResultSet object (rs) that represents the result set of the executed query.*/
//             rs = st.executeQuery(query);
//
////
////        while (rs.next ()) {
////            System.out.println(rs.getInt(1)); //since percentage  field in table is int we used rs.getInt(1)
////        }
//
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3) + " : " + rs.getString(4) + " : " + rs.getString(5) + " : " + rs.getLong(6)); //since percentage  field in table is int we used rs.getInt(1)
//            }
//
//
//            /* This line closes the Statement object (st) to release any resources associated with it. */
//            st.close();


            /* This line closes the Connection object (con) to release any resources associated with it and to terminate the connection to the database. */
            con.close();

        } catch (Exception e) {
            System.out.println("Error occurred:");
            e.printStackTrace();
        }
    }
}

