package pt.utad.mei.aps;

public class NotFullRoomState extends RoomState {
    @Override
    void enter(String RFID) {
        if (!room.letIn(RFID)) {
            System.out.println("Student " + RFID + " is already in the room.");
            return;
        }
        System.out.println("Student " + RFID + " entered the room.");
        if (room.isFull()) {
            room.changeState(new FullRoomState());
            System.out.println("Room is now full.");
        }
    }

    @Override
    void leave(String RFID) {
        if (!room.letOut(RFID)) {
            System.out.println("RFID " + RFID + " is not in the room!");
            return;
        }
        if (Room.isTeacher(RFID)) {
            room.changeState(new ClosedRoomState());
            System.out.println("Teacher " + RFID + " left the room! Room is now closed!");
        } else {
            System.out.println("Student " + RFID + " left the room!");
        }
    }
}
