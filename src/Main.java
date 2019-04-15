import java.sql.*;

public class Main {

    public static void main(String[] args) {

        final String host = "jdbc:mysql://localhost/example_database?useLegacyDatetimeCode=false&serverTimezone=UTC";
        final String username = "root";
        final String password = "";

        try{
            // Connect to database and execute query
            Connection connection = DriverManager.getConnection(host, username, password);
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM example_table";
            ResultSet resultSet = statement.executeQuery(query);

            // Print result rows
            while (resultSet.next()){
                System.out.print(resultSet.getString("id") + " ");
                System.out.print(resultSet.getString("value"));
                System.out.println();
            }

        } catch (SQLException exception){
            exception.printStackTrace();
        }

    }
}
