import java.io.*;
import java.sql.SQLException;

public class Compulsory {
    public static void main(String args[]) {
        try {
            var artists = new ArtistAO();
            artists.create("Pink Floyd");
            artists.create("Michael Jackson");

            //artists.printAlbums();
            Database.getConnection().close();
        } catch (SQLException e) {
            System.err.println(e);
            Database.rollback();
        }

        var albums = new AlbumAO();

        var csv = new CSVManager("D:\\prog_avansata_2023/albumlist.csv");

        csv.databaseInsert(albums);

        try {
            albums.printAlbums();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}