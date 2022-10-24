package pt.utad.mei.aps;

public class FileSystemFactory implements StorageFactory {
    @Override
    public Storage getStorage() {
        return new FileSystem(512_000_000_000L);
    }
}
