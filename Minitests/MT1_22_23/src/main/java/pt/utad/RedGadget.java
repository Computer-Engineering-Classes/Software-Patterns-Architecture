package pt.utad;

public class RedGadget extends Gadget {
    public RedGadget(int x, int y) {
        super(Color.RED, x, y);
    }

    public RedGadget(RedGadget target) {
        super(target);
    }


    @Override
    public Gadget clone() {
        return new RedGadget(this);
    }

    @Override
    public String getPrize() {
        return "No prize";
    }
}
