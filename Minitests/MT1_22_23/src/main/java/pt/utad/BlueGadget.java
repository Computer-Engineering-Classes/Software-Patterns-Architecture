package pt.utad;

public class BlueGadget extends Gadget {
    public BlueGadget(int x, int y) {
        super(Color.BLUE, x, y);
    }

    public BlueGadget(BlueGadget target) {
        super(target);
    }


    @Override
    public Gadget clone() {
        return new BlueGadget(this);
    }

    @Override
    public String getPrize() {
        return "Extra points";
    }
}
