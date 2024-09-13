package composition;

import java.util.ArrayList;

class File {
    private String name;

    File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println(name);
    }
}

class Folder {
    private String name;
    private ArrayList<Folder> subFolders;
    private ArrayList<File> files;

    Folder(String name) {
        this.name = name;
        this.files = new ArrayList<File>();
        this.subFolders = new ArrayList<Folder>();
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

public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("php_demo1");
        Folder sourceFiles = new Folder("Source Files");
        root.getSubFolders().add(sourceFiles);

        Folder phalcon = new Folder(".phalcon");
        sourceFiles.getSubFolders().add(phalcon);

        Folder app = new Folder("app");
        sourceFiles.getSubFolders().add(app);

        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");

        app.getSubFolders().add(config);
        app.getSubFolders().add(controllers);
        app.getSubFolders().add(library);
        app.getSubFolders().add(migrations);
        app.getSubFolders().add(models);
        app.getSubFolders().add(views);

        Folder cache = new Folder("cache");
        sourceFiles.getSubFolders().add(cache);

        Folder publicFolder = new Folder("public");
        sourceFiles.getSubFolders().add(publicFolder);

        File htaccess = new File(".htaccess");
        publicFolder.getFiles().add(htaccess);

        File htrouter = new File(".htrouter.php");
        publicFolder.getFiles().add(htrouter);

        File index = new File("index.html");
        publicFolder.getFiles().add(index);

        Folder includePath = new Folder("Include Path");
        root.getSubFolders().add(includePath);

        File remoteFiles = new File("Remote Files");
        root.getFiles().add(remoteFiles);

        root.print();

        System.out.println("\nRemoved folder app");
        sourceFiles.getSubFolders().remove(app);
        root.print();

        System.out.println("\nRemoved folder public");
        sourceFiles.getSubFolders().remove(publicFolder);
        root.print();
    }
}
