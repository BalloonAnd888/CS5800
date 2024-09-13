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

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
//        System.out.println("This is a File");
        System.out.println(name);
    }
}

class Folder {
    private String name;
    private ArrayList<Folder> subFolders;
    private ArrayList<File> files;

    Folder(String name) {
        this.name = name;
        this.subFolders = new ArrayList<Folder>();
        this.files = new ArrayList<File>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSubFolder(Folder subFolder) {
        subFolders.add(subFolder);
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void removeSubFolder(String name) {
        subFolders.removeIf(folder -> folder.getName().equals(name));
    }

    public void print() {
//        System.out.println("This is a Folder");
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
//        System.out.println("Composition");
        Folder root = new Folder("php_demo1");
        Folder sourceFiles = new Folder("Source Files");
        root.addSubFolder(sourceFiles);
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        sourceFiles.addSubFolder(phalcon);
        sourceFiles.addSubFolder(app);
        app.addSubFolder(new Folder("config"));
        app.addSubFolder(new Folder("controllers"));
        app.addSubFolder(new Folder("library"));
        app.addSubFolder(new Folder("migrations"));
        app.addSubFolder(new Folder("models"));
        app.addSubFolder(new Folder("views"));

        Folder cache = new Folder("cache");
        sourceFiles.addSubFolder(cache);

        Folder publicFolder = new Folder("public");
        publicFolder.addFile(new File(".htaccess"));
        publicFolder.addFile(new File(".htrouter.php"));
        publicFolder.addFile(new File(".index.html"));
        sourceFiles.addSubFolder(publicFolder);

        Folder includePath = new Folder("Include Path");
        root.addSubFolder(includePath);
        File remoteFiles = new File("Remote Files");
        root.addFile(remoteFiles);

//        root.print();

        root.removeSubFolder("app");
        System.out.println("Removed folder app");
        root.print();



    }
}
