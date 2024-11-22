package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Jdbc {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://Localhost:3306/customer";  //url for connection; here student is our database
        String uname = "root";       //username
        String pass ="8920611534";  //password

        Class.forName("com.mysql.cj.jdbc.Driver"); //Load and Register the Driver

        Connection con = DriverManager.getConnection(url, uname, pass); // Establish the Connection

        Statement st = con.createStatement();

        String query = "select * from customer.custo_details"; //percentage is table inside Student
        ResultSet rs = st.executeQuery (query);

        while (rs.next ()) {
            System.out.println(rs.getInt(1)); //since percentage  field in table is int we used rs.getInt(1)
        }
            st.close();
            con.close();

        }

}