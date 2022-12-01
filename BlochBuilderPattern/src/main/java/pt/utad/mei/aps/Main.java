package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
        var casa = new Casa.Builder()
                .paredes("4x, Betão")
                .janelas("2x, 40x60cm")
                .portas("1x, Carvalho")
                .telhado("Telha")
                .temJardim(true)
                .temPiscina(true)
                .build();
        System.out.println("Casa: " + casa);

        var barraco = new Casa.Builder()
                .paredes("4x, PVC")
                .janelas("1x, 40x40cm")
                .portas("1x, Tábua")
                .telhado("Amianto")
                .build();
        System.out.println("Barraco: " + barraco);
    }
}