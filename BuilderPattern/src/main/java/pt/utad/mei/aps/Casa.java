package pt.utad.mei.aps;

public class Casa {
    private final String paredes;
    private final String portas;
    private final String janelas;
    private final String telhado;
    private final boolean temJardim;
    private final boolean temPiscina;

    public Casa(String paredes, String portas, String janelas, String telhado, boolean temJardim, boolean temPiscina) {
        this.paredes = paredes;
        this.portas = portas;
        this.janelas = janelas;
        this.telhado = telhado;
        this.temJardim = temJardim;
        this.temPiscina = temPiscina;
    }

    public void details() {
        System.out.println("Paredes: " + paredes);
        System.out.println("Portas: " + portas);
        System.out.println("Janelas: " + janelas);
        System.out.println("Telhado: " + telhado);
        System.out.println("Tem jardim: " + temJardim);
        System.out.println("Tem piscina: " + temPiscina);
    }
}
