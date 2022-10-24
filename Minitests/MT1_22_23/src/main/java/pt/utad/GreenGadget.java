package pt.utad;

public class GreenGadget extends Gadget {
    public GreenGadget(int x, int y) {
        super(Color.GREEN, x, y);
    }

    public GreenGadget(GreenGadget target) {
        super(target);
    }


    @Override
    public Gadget clone() {
        return new GreenGadget(this);
    }

    @Override
    public String getPrize() {
        return "Extra life";
    }
}
