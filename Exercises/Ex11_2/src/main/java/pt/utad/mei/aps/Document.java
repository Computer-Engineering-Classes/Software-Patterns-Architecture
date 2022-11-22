package pt.utad.mei.aps;

public class Document implements File {
    private final String name;
    private final String extension;

    public Document(String name, String extension) {
        this.name = name;
        this.extension = extension;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getExtension() {
        return extension;
    }

    @Override
    public void writeToDisk() {
        System.out.println("Writing document to disk...");
    }
}
