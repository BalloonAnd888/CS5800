package composition.folder;

import java.util.ArrayList;
import composition.file.File;

public class Folder {
    protected String name;
    protected ArrayList<Folder> subFolders;
    protected ArrayList<File> files;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.subFolders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Folder> getSubFolders() {
        return subFolders;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void print() {
        System.out.println(name);

        for (File file : files) {
            file.print();
        }

        for (Folder subFolder : subFolders) {
            subFolder.print();
        }
    }
}
