package Resources;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="folders")

public class Folder {
    private int id;
    private String name;
    private String extension;
    private int size;
    private List<Folder> folders;

    public Folder() {
    }

    public Folder(String name, String extension, int size) {
        this.name = name;
        this.extension = extension;
        this.size = size;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }
    @Column(name="name")
    public String getName() {
        return name;
    }
    @Column(name="extension")
    public String getExtension() {
        return extension;
    }
    @Column(name="size kb")
    public int getSize() {
        return size;
    }
    @Column(name="folders")
    public List<Folder> getFolders() {
        return folders;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }
}
