package pt.utad.mei.aps;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void changeBuilder(Builder builder) {
        this.builder = builder;
    }

    public void make(PCType pcType) {
        switch (pcType) {

            case PC -> {
                builder.setCPU("Intel i5 11th gen");
                builder.setGPU("Integrated Graphics");
                builder.setRAM(8);
                builder.setRAM(256);
            }
            case WORKSTATION -> {
                builder.setCPU("Intel i9 12th gen");
                builder.setGPU("Nvidia Quadro");
                builder.setRAM(32);
                builder.setDiskSpace(4096);
            }
            case GAMING_PC -> {
                builder.setCPU("Ryzen 7 6800X");
                builder.setGPU("Nvidia RTX 4060");
                builder.setRAM(16);
                builder.setDiskSpace(512);
            }
        }
    }

}
