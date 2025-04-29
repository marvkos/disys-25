package at.technikum;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection =
                DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/energy",
                        "disysuser",
                        "disyspw"
                );

        String query = "SELECT * FROM lecture";

        PreparedStatement stmt = connection.prepareStatement(query);

        ResultSet resultSet = stmt.executeQuery();

        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }
    }
}
