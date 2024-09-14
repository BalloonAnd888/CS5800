package composition.file;

public class File {
    protected String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println(name);
    }
}
