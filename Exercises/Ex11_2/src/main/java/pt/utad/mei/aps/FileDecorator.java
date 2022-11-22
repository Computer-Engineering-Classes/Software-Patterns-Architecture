package pt.utad.mei.aps;

public abstract class FileDecorator implements File {
    private final File file;

    public FileDecorator(File file) {
        this.file = file;
    }

    @Override
    public String getName() {
        return file.getName();
    }

    @Override
    public String getExtension() {
        return file.getExtension();
    }

    @Override
    public void writeToDisk() {
        file.writeToDisk();
    }
}
