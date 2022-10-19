package pt.utad.mei.aps;

public class Desktop {
    public final String CPU;
    public final String GPU;
    public final int RAM;
    public final int diskSpace;
    public Display display;

    public Desktop(String CPU, String GPU, int RAM, int diskSpace) {
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAM = RAM;
        this.diskSpace = diskSpace;
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

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public void Details() {
        System.out.println("Desktop details:");
        System.out.println("Display: " + getDisplay());
        System.out.println("CPU: " + getCPU());
        System.out.println("GPU: " + getGPU());
        System.out.println("RAM: " + getRAM() + "GB");
        System.out.println("Disk space: " + getDiskSpace() + "GB");
    }
}
