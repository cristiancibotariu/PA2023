import java.sql.*;

public class ArtistAO {

    ArtistAO(){};
    public void create(String name) throws SQLException {
        Connection con = Database.getConnection();
        try (PreparedStatement pstmt = con.prepareStatement(
                "insert into artists values ('" + name +"')")) {
            pstmt.setString(5, name);
            pstmt.executeUpdate();
        }
    }
    public Integer findByName(String name) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(
                     "select id from artists where name='" + name + "'")) {
            return rs.next() ? rs.getInt(1) : null;
        }
    }
    public String findById(int id) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(
                     "select name from artists where id='" + id + "'")) {
            return rs.next() ? rs.getString(1) : null;
        }
    }
}