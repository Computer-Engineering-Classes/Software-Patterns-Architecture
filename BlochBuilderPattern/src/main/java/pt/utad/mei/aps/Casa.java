package pt.utad.mei.aps;

public class Casa {
    private final String paredes;
    private final String portas;
    private final String janelas;
    private final String telhado;
    private final boolean temJardim;
    private final boolean temPiscina;

    private Casa(Builder builder) {
        paredes = builder.paredes;
        portas = builder.portas;
        janelas = builder.janelas;
        telhado = builder.telhado;
        temJardim = builder.temJardim;
        temPiscina = builder.temPiscina;
    }

    public static class Builder {
        private String paredes;
        private String portas;
        private String janelas;
        private String telhado;
        private boolean temJardim;
        private boolean temPiscina;

        public Builder paredes(String paredes) {
            this.paredes = paredes;
            return this;
        }

        public Builder portas(String portas) {
            this.portas = portas;
            return this;
        }

        public Builder janelas(String janelas) {
            this.janelas = janelas;
            return this;
        }

        public Builder telhado(String telhado) {
            this.telhado = telhado;
            return this;
        }

        public Builder temJardim() {
            this.temJardim = true;
            return this;
        }

        public Builder temPiscina() {
            this.temPiscina = true;
            return this;
        }

        public Casa build() {
            return new Casa(this);
        }
    }

    @Override
    public String toString() {
        return "Casa{" +
                "paredes='" + paredes + '\'' +
                ", portas='" + portas + '\'' +
                ", janelas='" + janelas + '\'' +
                ", telhado='" + telhado + '\'' +
                ", temJardim=" + temJardim +
                ", temPiscina=" + temPiscina +
                '}';
    }
}
