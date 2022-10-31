package pt.utad.mei.aps;

public class CasaBuilder implements Builder {
    private String paredes;
    private String portas;
    private String janelas;
    private String telhado;
    private boolean temJardim;
    private boolean temPiscina;

    @Override
    public void reset() {
        paredes = null;
        portas = null;
        janelas = null;
        telhado = null;
        temJardim = false;
        temPiscina = false;
    }
    @Override
    public void buildParedes(String paredes) {
        this.paredes = paredes;
    }
    @Override
    public void buildPortas(String portas) {
        this.portas = portas;
    }
    @Override
    public void buildJanelas(String janelas) {
        this.janelas = janelas;
    }
    @Override
    public void buildTelhado(String telhado) {
        this.telhado = telhado;
    }
    @Override
    public void buildJardim() {
        this.temJardim = true;
    }
    @Override
    public void buildPiscina() {
        this.temPiscina = true;
    }
    public Casa getCasa() {
        return new Casa(paredes, portas, janelas, telhado, temJardim, temPiscina);
    }
}
