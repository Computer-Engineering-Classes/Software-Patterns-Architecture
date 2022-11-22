package pt.utad.mei.aps;

public class CompressedFile extends FileDecorator {
    public CompressedFile(File file) {
        super(file);
    }

    @Override
    public void writeToDisk() {
        System.out.println("Compressing file...");
        super.writeToDisk();
    }
}
