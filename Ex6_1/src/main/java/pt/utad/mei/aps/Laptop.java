package pt.utad.mei.aps;

public class Laptop {
    public final String CPU;
    public final String GPU;
    public final int RAM;
    public final int diskSpace;
    public String modelName;
    public Laptop(String CPU, String GPU, int RAM, int diskSpace) {
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAM = RAM;
        this.diskSpace = diskSpace;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getCPU() {
        return CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public int getRAM() {
        return RAM;
    }

    public int getDiskSpace() {
        return diskSpace;
    }

    public void Details() {
        System.out.println("Laptop details:");
        System.out.println("Model name: " + getModelName());
        System.out.println("CPU: " + getCPU());
        System.out.println("GPU: " + getGPU());
        System.out.println("RAM: " + getRAM() + "GB");
        System.out.println("Disk space: " + getDiskSpace() + "GB");
    }
}
