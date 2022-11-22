package pt.utad.mei.aps;

public class EncryptedFile extends FileDecorator {
    public EncryptedFile(File file) {
        super(file);
    }

    @Override
    public void writeToDisk() {
        System.out.println("Encrypting file...");
        super.writeToDisk();
    }
}
