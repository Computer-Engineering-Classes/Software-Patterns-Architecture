package pt.utad.mei.aps;

// No teacher is present, only teachers can enter, students can leave
public class ClosedRoomState extends RoomState {
    @Override
    void enter(String RFID) {
        if (!Room.isTeacher(RFID)) {
            System.out.println("Student " + RFID + " cannot enter the room! It is closed!");
            return;
        }
        room.letIn(RFID);
        System.out.println("Teacher " + RFID + " entered the room.");
        if (room.isFull()) {
            System.out.println("Room is full!");
            room.changeState(new FullRoomState());
        } else {
            room.changeState(new NotFullRoomState());
        }
    }

    @Override
    void leave(String RFID) {
        if (room.letOut(RFID)) {
            System.out.println("Student " + RFID + " left the room.");
        } else {
            System.out.println("Student " + RFID + " is not in the room!");
        }
    }
}
