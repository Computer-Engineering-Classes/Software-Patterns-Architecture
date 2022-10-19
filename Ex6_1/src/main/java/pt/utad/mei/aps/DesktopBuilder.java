package pt.utad.mei.aps;

public class DesktopBuilder implements Builder {
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

    public Desktop getResult() {
        return new Desktop(CPU, GPU, RAM, diskSpace);
    }
}
