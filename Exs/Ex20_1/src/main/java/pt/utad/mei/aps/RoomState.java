package pt.utad.mei.aps;

public abstract class RoomState {
    protected Room room;

    public void setRoom(Room room) {
        this.room = room;
    }

    // State-specific behavior doThis()
    abstract void enter(String RFID);

    // State-specific behavior doThat()
    abstract void leave(String RFID);
}
