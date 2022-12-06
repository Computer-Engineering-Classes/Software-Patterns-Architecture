package pt.utad.mei.aps;

public class FcpFan extends SoccerFan {
    @Override
    public void goToStadium() {
        System.out.println("Ir ao estádio do Dragão...");
    }

    @Override
    public void watchMatch() {
        System.out.println("Ver o jogo do FC Porto...");
        System.out.println("Olé, olé, olé!");
    }

    @Override
    protected void beforeGoingToStadium() {
        System.out.println("Beber umas cervejas...");
    }

    @Override
    protected void afterGoingHome() {
        System.out.println("Andar à porrada com a polícia!");
    }
}
