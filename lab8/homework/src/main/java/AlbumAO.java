import java.sql.*;

public class AlbumAO {

    AlbumAO(){};
    public void create(String title, String artist, String genre, int releaseYear) throws SQLException {
        Connection con = Database.getConnection();
        try (PreparedStatement pstmt = con.prepareStatement(
                "insert into albums (title, artist, genre, release_year) values (?, ?, ?, ?)")) {
            pstmt.setString(1, title);
            pstmt.setString(2, artist);
            pstmt.setString(3, genre);
            pstmt.setInt(4, releaseYear);
            pstmt.executeUpdate();
        }
    }
    public Integer findByName(String name) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(
                     "select id from albums where title='" + name + "'")) {
            return rs.next() ? rs.getInt(1) : null;
        }
    }
    public String findById(int id) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(
                     "select name from albums where id='" + id + "'")) {
            return rs.next() ? rs.getString(1) : null;
        }
    }

    public void printAlbums() throws SQLException {
        Connection con = Database.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select title from albums");
        while (rs.next()) {
            String name = rs.getString("title");
            System.out.println(name);
        }
    }
}