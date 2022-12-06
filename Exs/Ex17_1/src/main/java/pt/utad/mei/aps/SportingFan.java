package pt.utad.mei.aps;

public class SportingFan extends SoccerFan {
    @Override
    public void goToStadium() {
        System.out.println("Ir ao estádio do Alvalade...");
    }

    @Override
    public void watchMatch() {
        System.out.println("Ver o jogo do Sporting...");
        System.out.println("Olé, olé, olé!");
    }

    @Override
    protected void beforeGoingToStadium() {
        System.out.println("Tomar a medicação...");
    }

    @Override
    protected void afterGoingHome() {
        System.out.println("Chorar até dormir!");
    }
}
