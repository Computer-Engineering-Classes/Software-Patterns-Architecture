package pt.utad.mei.aps;

public record Casa(String paredes, String portas, String janelas, String telhado, boolean temJardim,
                   boolean temPiscina) {
    private Casa(Builder builder) {
        this(builder.paredes, builder.portas, builder.janelas, builder.telhado, builder.temJardim, builder.temPiscina);
    }

    @Override
    public String toString() {
        return String.format("Casa{paredes='%s', portas='%s', janelas='%s', telhado='%s', temJardim=%s, temPiscina=%s}",
                paredes, portas, janelas, telhado, temJardim, temPiscina);
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

        public Builder temJardim(boolean temJardim) {
            this.temJardim = temJardim;
            return this;
        }

        public Builder temPiscina(boolean temPiscina) {
            this.temPiscina = temPiscina;
            return this;
        }

        public Casa build() {
            return new Casa(this);
        }
    }
}
