package pt.utad.mei.aps;

import java.util.ArrayList;
import java.util.List;

// Context class
public class Room {
    private final List<String> RFIDs;
    private final int maxCapacity;
    private RoomState state;

    public Room(int maxCapacity, RoomState state) {
        this.maxCapacity = maxCapacity;
        this.RFIDs = new ArrayList<>();
        this.state = state;
        this.state.setRoom(this);
    }

    public static Boolean isTeacher(String RFID) {
        return RFID.startsWith("T");
    }

    public void enter(String rfid) {
        state.enter(rfid);
    }

    public void leave(String rfid) {
        state.leave(rfid);
    }

    public void changeState(RoomState state) {
        this.state = state;
        this.state.setRoom(this);
    }

    public Boolean isPresent(String RFID) {
        return RFIDs.contains(RFID);
    }

    public boolean isFull() {
        return RFIDs.size() == maxCapacity;
    }

    public void letIn(String RFID) {
        RFIDs.add(RFID);
    }

    public void letOut(String RFID) {
        RFIDs.remove(RFID);
    }
}
