package pt.utad.mei.aps;

public interface Builder {
    void setCPU(String CPU);

    void setGPU(String GPU);

    void setRAM(int RAM);

    void setDiskSpace(int diskSpace);
}
