
package JDBCStudent;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:330/school";
        String username = "root";
        String password = "sradha2665sahoo12345";

        try {

            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Driver Loaded Successfully");

            Connection con = DriverManager.getConnection(
                    url, username, password);

            System.out.println("Database Connected Successfully");

            con.close();

        } catch (ClassNotFoundException e) {

            System.out.println("MySQL Driver Not Found");
            e.printStackTrace();

        } catch (Exception e) {

            System.out.println("Database Connection Failed");
            e.printStackTrace();

        }
    }
}