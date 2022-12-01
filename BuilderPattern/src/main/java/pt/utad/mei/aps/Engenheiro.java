package pt.utad.mei.aps;

public class Engenheiro extends CasaBuilder {
    private final Builder builder;

    public Engenheiro(CasaBuilder builder) {
        this.builder = builder;
    }

    public void construirCasa(TipoCasa tipoCasa) {
        builder.reset();
        switch (tipoCasa) {
            case CABANA -> {
                builder.buildParedes("Cedro, 25cm");
                builder.buildPortas("1x, Carvalho");
                builder.buildJanelas("4x, 100x50cm");
                builder.buildTelhado("Telha de cedro");
            }
            case TIJOLO -> {
                builder.buildParedes("Tijolo, 20cm");
                builder.buildPortas("2x, Aluminio");
                builder.buildJanelas("6x, 50x50cm");
                builder.buildTelhado("Telha mista");
                builder.buildJardim();
                builder.buildPiscina();
            }
        }
    }
}
