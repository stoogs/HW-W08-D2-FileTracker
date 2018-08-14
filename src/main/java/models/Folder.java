package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {

    private int id;
    private String folderName;
    private List<File> files;

    public Folder() {
    }

    //CONSTRUCTOR
    public Folder(String folderName) {
        this.folderName = folderName;
    }

    // GETTERS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    @Column(name="folder_name")
    public String getFolderName() {
        return folderName;
    }

    @OneToMany(mappedBy = "folder", fetch = FetchType.LAZY)
    public List<File> getFiles() {
        return files;
    }

//SETTERS
    public void setId(int id) {
        this.id = id;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}
