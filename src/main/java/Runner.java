import db.DBHelper;
import models.File;
import models.Folder;

public class Runner {

    public static void main(String[] args) {
        Folder wallpapers = new Folder("Wallpapers");
        DBHelper.save(wallpapers);
        File background1 = new File("background1", "png", 512, wallpapers);
        DBHelper.save(background1);

    }
}


//TODO A file should have a name, extension (e.g. txt, rb, java, ppt), size and folder.
//TODO A folder should have a title and list of files.
//TODO Create the CRUD methods.
//TODO Create method to get list of all files in a folder.