package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
        SoccerFan fcpFan = new FcpFan();
        fcpFan.goWatchMatch();

        SoccerFan sportingFan = new SportingFan();
        sportingFan.goWatchMatch();
    }
}