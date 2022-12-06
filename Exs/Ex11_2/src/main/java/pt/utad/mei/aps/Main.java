package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("MyDocument", "txt");
        CompressedFile compressedFile = new CompressedFile(document);
        EncryptedFile encryptedFile = new EncryptedFile(compressedFile);

        encryptedFile.writeToDisk();
    }
}