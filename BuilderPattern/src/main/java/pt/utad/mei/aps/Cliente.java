package pt.utad.mei.aps;

public class Cliente {
    public static void main(String[] args) {
        var casaBuilder = new CasaBuilder();
        var engenheiro = new Engenheiro(casaBuilder);

        engenheiro.construirCasa(TipoCasa.CABANA);
        var cabana = casaBuilder.getCasa();
        System.out.println("Cabana:");
        cabana.details();

        System.out.print('\n');

        engenheiro.construirCasa(TipoCasa.TIJOLO);
        var casaTijolo = casaBuilder.getCasa();
        System.out.println("Casa de tijolo:");
        casaTijolo.details();
    }
}