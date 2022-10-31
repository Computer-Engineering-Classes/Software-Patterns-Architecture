package pt.utad.mei.aps;

public interface Builder {
    void reset();

    void buildParedes(String paredes);

    void buildPortas(String portas);

    void buildJanelas(String janelas);

    void buildTelhado(String telhado);

    void buildJardim();

    void buildPiscina();
}
