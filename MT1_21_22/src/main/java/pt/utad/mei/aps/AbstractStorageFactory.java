package pt.utad.mei.aps;

public abstract class AbstractStorageFactory {
    public abstract Storage getStorage(StorageType storageType);
}
