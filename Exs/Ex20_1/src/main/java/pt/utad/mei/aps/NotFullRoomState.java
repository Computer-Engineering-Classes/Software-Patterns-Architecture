package pt.utad.mei.aps;

public class NotFullRoomState extends RoomState {
    @Override
    void enter(String RFID) {
        if (room.isPresent(RFID)) {
            System.out.println("RFID " + RFID + " is already in the room!");
        } else if (room.isFull()) {
            room.changeState(new FullRoomState());
            System.out.println("RFID" + RFID + "cannot enter the room. It is full!");
        } else if (Room.isTeacher(RFID)) {
            System.out.println("Teacher " + RFID + " entered the room!");
        } else {
            room.letIn(RFID);
            System.out.println("Student " + RFID + " entered the room!");
        }
    }

    @Override
    void leave(String RFID) {
        if (!room.isPresent(RFID)) {
            System.out.println("RFID " + RFID + " not found in the room!");
            return;
        }
        room.letOut(RFID);
        if (Room.isTeacher(RFID)) {
            room.changeState(new ClosedRoomState());
            System.out.println("Teacher " + RFID + " left the room! Room is now closed!");
        } else {
            System.out.println("Student " + RFID + " left the room!");
        }
    }
}
