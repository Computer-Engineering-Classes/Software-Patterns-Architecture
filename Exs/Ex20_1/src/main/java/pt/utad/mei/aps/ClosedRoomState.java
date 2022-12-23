package pt.utad.mei.aps;

public class ClosedRoomState extends RoomState {
    @Override
    void enter(String RFID) {
        if (!Room.isTeacher(RFID)) {
            System.out.println("Student " + RFID + " cannot enter the room! It is closed!");
            return;
        }
        room.letIn(RFID);
        if (room.isFull()) {
            room.changeState(new FullRoomState());
            System.out.println("Student " + RFID + " entered the room! It is now full!");
        } else {
            room.changeState(new NotFullRoomState());
            System.out.println("Teacher " + RFID + " entered the room!");
        }
    }

    @Override
    void leave(String RFID) {
        if (!room.isPresent(RFID)) {
            System.out.println("RFID " + RFID + " not found in the room!");
            return;
        }
        room.letOut(RFID);
        room.changeState(new NotFullRoomState());
        if (Room.isTeacher(RFID)) {
            System.out.println("Teacher " + RFID + " left the room!");
        } else {
            System.out.println("Student " + RFID + " left the room!");
        }
    }
}
