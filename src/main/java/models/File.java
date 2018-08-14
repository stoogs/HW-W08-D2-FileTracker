package models;

import javax.persistence.*;

@Entity
@Table(name = "files")

public class File {
    private int id;
    private String fileName;
    private String extension;
    private Folder folder;
    private int size;

    public File() {
    }

    public File(String fileName, String extension, int size, Folder folder) {
        this.fileName = fileName;
        this.extension = extension;
        this.size = size;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }
    @Column(name="file_name")
    public String getFileName() {
        return fileName;
    }
    @Column(name="extension")
    public String getExtension() {
        return extension;
    }
    @Column(name="size kb")
    public int getSize() {
        return size;
    }
    @JoinColumn(name = "folder_id", nullable = false)
    public Folder getFolder() {
        return folder;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
