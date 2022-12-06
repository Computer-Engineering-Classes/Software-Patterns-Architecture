package pt.utad.mei.aps;

public abstract class SoccerFan {
    public final void goWatchMatch() {
        buyTicket();
        beforeGoingToStadium(); // Hook method
        goToStadium();
        watchMatch();
        goHome();
        afterGoingHome(); // Hook method
    }

    private void buyTicket() {
        System.out.println("Comprar bilhete...");
    }

    protected abstract void goToStadium();

    protected abstract void watchMatch();

    private void goHome() {
        System.out.println("Ir para casa...");
    }

    protected void beforeGoingToStadium() {
        // Hook method
    }

    protected void afterGoingHome() {
        // Hook method
    }
}