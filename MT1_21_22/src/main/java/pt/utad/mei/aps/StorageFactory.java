package pt.utad.mei.aps;

public class StorageFactory extends AbstractStorageFactory {
    @Override
    public Storage getStorage(StorageType storageType) {
        switch (storageType) {

            case RAM -> {
                return new Ram(16_000_000_000L);
            }
            case FILESYSTEM -> {
                return new FileSystem(512_000_000_000L);
            }
            case DATABASE -> {
                return new Database(256_000_000_000L);
            }
            case CLOUD -> {
                return new Cloud(1_000_000_000_000L);
            }
        }
        return null;
    }
}
