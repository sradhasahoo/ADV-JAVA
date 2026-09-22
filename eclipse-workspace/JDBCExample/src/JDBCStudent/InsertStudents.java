
package JDBCStudent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertStudents {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:330/school";
        String username = "root";
        String password = "sradha2665sahoo12345";

        String query = "INSERT INTO student (id, name, city) VALUES (?, ?, ?)";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    url, username, password);

            PreparedStatement ps = con.prepareStatement(query);

            // Insert Record 1
            ps.setInt(1, 1);
            ps.setString(2, "Rahul");
            ps.setString(3, "Bangalore");
            ps.executeUpdate();

            // Insert Record 2
            ps.setInt(1, 2);
            ps.setString(2, "Priya");
            ps.setString(3, "Mumbai");
            ps.executeUpdate();

            // Insert Record 3
            ps.setInt(1, 3);
            ps.setString(2, "Amit");
            ps.setString(3, "Delhi");
            ps.executeUpdate();

            // Insert Record 4
            ps.setInt(1, 4);
            ps.setString(2, "Sneha");
            ps.setString(3, "Chennai");
            ps.executeUpdate();

            // Insert Record 5
            ps.setInt(1, 5);
            ps.setString(2, "Kiran");
            ps.setString(3, "Hyderabad");
            ps.executeUpdate();

            System.out.println("5 Student Records Inserted Successfully");

            ps.close();
            con.close();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
}