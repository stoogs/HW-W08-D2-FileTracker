import db.DBHelper;
import models.File;
import models.Folder;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Folder wallpapers = new Folder("Wallpapers");
        DBHelper.save(wallpapers);
        Folder holiday = new Folder("Holiday");
        DBHelper.save(holiday);
        File background1 = new File("Kittens", "png", 512, wallpapers);
        File background2 = new File("Sloths", "png", 256, wallpapers);
        File background3 = new File("Fast Cars", "png", 1024, wallpapers);
        File background4 = new File("Stars", "png", 2048, wallpapers);
        File background5 = new File("3d Rendered", "png", 128, wallpapers);
        File background6 = new File("DCIM-00001", "png", 64, holiday);
        File background7 = new File("Spice Girls", "png", 32, wallpapers);
        DBHelper.save(background1);
        DBHelper.save(background2);
        DBHelper.save(background3);
        DBHelper.save(background4);
        DBHelper.save(background5);
        DBHelper.save(background6);
        DBHelper.save(background7);
        background4.setFileName("Stars, stars, stars");
        DBHelper.update(background4);
        DBHelper.delete(background7);

        List<File> files =  DBHelper.getAll(File.class);
        System.out.println(files);
        List<Folder> folders =  DBHelper.getAll(Folder.class);
        System.out.println(folders);




    }
}


//TODO A file should have a name, extension (e.g. txt, rb, java, ppt), size and folder.
//TODO A folder should have a title and list of files.
//TODO Create the CRUD methods.
//TODO Create method to get list of all files in a folder.