import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Compulsory {

    public static void main(String[] args) throws IOException {

        var documents = IntStream.rangeClosed(0, 2)
                .mapToObj(i -> new Document(i, "D" + i, "path_random") )
                .collect(Collectors.toCollection(ArrayList<Document>::new));
        Catalog catalog = new Catalog(documents);

        CatalogUtil.save(catalog, "E:\\ceva/catalog.json");
    }
}
