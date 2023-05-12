import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class CSVManager {
    public String filePath;

    CSVManager(String filePath){
        this.filePath=filePath;
    }

    public void databaseInsert(AlbumAO albums){

        String line="";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));

            line = br.readLine();
            int i=0;
            while((line = br.readLine()) != null && i<50){
                String[] values = line.split(",");
                // 1 - ani, 2 - titlu, 3-artist, 4-genre
                try {
                    albums.create(values[2], values[3], values[4], Integer.valueOf(values[1]));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                i++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
