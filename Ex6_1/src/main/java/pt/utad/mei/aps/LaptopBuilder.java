package pt.utad.mei.aps;

public class LaptopBuilder implements Builder {
    private String CPU;
    private String GPU;
    private int RAM;
    private int diskSpace;

    @Override
    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    @Override
    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    @Override
    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    @Override
    public void setDiskSpace(int diskSpace) {
        this.diskSpace = diskSpace;
    }

    public Laptop getResult() {
        return new Laptop(CPU, GPU, RAM, diskSpace);
    }
}
