package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
        Room room = new Room(5, new ClosedRoomState());

        room.enter("T1234");
        room.enter("AL1111");
        room.enter("AL2222");
        room.enter("AL1111");
        room.enter("AL1111");
        room.enter("AL2222");
        room.enter("AL3333");
        room.enter("AL4444");
        room.enter("AL5555");
        room.enter("AL6666");
        room.leave("AL4444");
        room.enter("AL6666");
        room.leave("T1234");
        room.leave("AL4444");
        room.leave("AL1111");
    }
}