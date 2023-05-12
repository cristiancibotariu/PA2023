import java.sql.*;

public class Database {
    private static final String URL =
            "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "progavas";
    private static final String PASSWORD = "java";
    private static Connection connection = null;
    private Database() {}
    public static Connection getConnection() throws SQLException {
        connection = DriverManager.getConnection(
                URL, USER, PASSWORD);
        return connection;
    }
    /*private static void createConnection() {
        try {
            Connection connection = getConnection();
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }*/
    public static void closeConnection() throws SQLException { connection.close(); }

    public static void rollback(){
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(
                     "rollback")) {
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}