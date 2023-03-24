import javax.print.Doc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Catalog {
    private ArrayList<Document> documents;

    //add, toString, save, load

    Catalog(ArrayList<Document> documents){
        this.documents = documents;
    }

    public ArrayList<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<Document> documents) {
        this.documents=documents;
    }

    public void add(Document document){
        documents.add(document);
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "documents=" + documents +
                '}';
    }
}
