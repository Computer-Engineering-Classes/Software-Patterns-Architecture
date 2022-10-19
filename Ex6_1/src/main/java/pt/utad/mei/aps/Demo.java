package pt.utad.mei.aps;

public class Demo {
    public static void main(String[] args) {
        var laptopBuilder = new LaptopBuilder();

        var director = new Director(laptopBuilder);
        director.make(PCType.GAMING_PC);

        var laptop = laptopBuilder.getResult();
        laptop.setModelName("Legion Slim 7");
        laptop.Details();

        System.out.print('\n');

        var desktopBuilder = new DesktopBuilder();
        director.changeBuilder(desktopBuilder);
        director.make(PCType.WORKSTATION);

        var desktop = desktopBuilder.getResult();
        var display = new Display("Philips", 3840, 2160);
        desktop.setDisplay(display);
        desktop.Details();
    }
}
