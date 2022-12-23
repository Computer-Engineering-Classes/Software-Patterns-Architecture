package pt.utad.mei.aps;

public class FullRoomState extends RoomState {
    @Override
    void enter(String RFID) {
        System.out.println("RFID " + RFID + " cannot enter the room! It is full!");
    }

    @Override
    void leave(String RFID) {
        if (!room.isPresent(RFID)) {
            System.out.println("RFID not found in the room!");
            return;
        }
        room.letOut(RFID);
        if (Room.isTeacher(RFID)) {
            room.changeState(new ClosedRoomState());
            System.out.println("Teacher " + RFID + " left the room! Room is now closed!");
        } else {
            room.changeState(new NotFullRoomState());
            System.out.println("Student " + RFID + " left the room! Room is not full anymore!");
        }
    }
}
