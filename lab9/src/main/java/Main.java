import java.sql.SQLException;

public class Main {
    public static void main (String[] args){
        var albums = new AlbumAO();
        try {
            albums.printAlbums();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
