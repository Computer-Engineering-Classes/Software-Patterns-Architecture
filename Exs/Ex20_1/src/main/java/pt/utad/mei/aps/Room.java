package pt.utad.mei.aps;

import java.util.HashSet;
import java.util.Set;

// Context class
public class Room {
    private final Set<String> RFIDs;
    private final int maxCapacity;
    private RoomState state;

    public Room(int maxCapacity, RoomState state) {
        this.maxCapacity = maxCapacity;
        this.RFIDs = new HashSet<>(maxCapacity);
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

    public boolean isFull() {
        return RFIDs.size() == maxCapacity;
    }

    /**
     * @return true if the RFID was not already in the room
     */
    public boolean letIn(String RFID) {
        return RFIDs.add(RFID);
    }

    /**
     * @return true if the RFID was in the room
     */
    public boolean letOut(String RFID) {
        return RFIDs.remove(RFID);
    }
}
