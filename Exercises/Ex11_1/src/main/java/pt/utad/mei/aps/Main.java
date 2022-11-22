package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
        StampableObject mug = new Mug();
        mug.print();

        var mugWithStamp = new RGBStamping(mug);
        mugWithStamp.print();

        BlackStamping mugDoublyStamped = new BlackStamping(mugWithStamp);
        mugDoublyStamped.print();

        StampableObject tShirt = new TShirt();
        tShirt.print();

        var tShirtWithStamp = new RGBStamping(tShirt);
        tShirtWithStamp.print();
    }
}