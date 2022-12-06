package pt.utad.mei.aps;

public interface File {
    String getName();
    String getExtension();

    void writeToDisk();
}
