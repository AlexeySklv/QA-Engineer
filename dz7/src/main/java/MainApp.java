import java.sql.*;

public class MainApp {

    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        userInterface.runApplication();
    }

    public static class Main {

        private static Statement statement;


        public static void main(String[] args) {
            try {

                Class.forName("org.sqlite.JDBC");


                Connection connection = DriverManager.getConnection("jdbc:sqlite:dz8.db");
                statement = connection.createStatement();

                populateDB();

            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }

        }

        private static void populateDB() throws SQLException {

            for (int i = 1; i < 11; i++) {
                statement.executeUpdate(
                        "INSERT INTO students (name, score) VALUES ('student" + i + "'," + i * 5 + ");"
                );
            }

        }

    }
}