package EntityClasses;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "albums")
public class AlbumEntity implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY, generator = "id")
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    AlbumEntity(){};

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AlbumEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
