public class Reserva {
    private String cliente;
    private int numeroQuarto;
    private int dias;

    private Reserva(ReservaBuilder builder) {
        this.cliente = builder.cliente;
        this.numeroQuarto = builder.numeroQuarto;
        this.dias = builder.dias;
    }

    @Override
    public String toString() {
        return "O(a) cliente " + cliente + " reservou o quarto " + numeroQuarto + " por " + dias + " dias.";
    }

    public static class ReservaBuilder {
        private String cliente;
        private int numeroQuarto;
        private int dias;

        public ReservaBuilder setCliente(String cliente) {
            this.cliente = cliente;
            return this;
        }

        public ReservaBuilder setNumeroQuarto(int numeroQuarto) {
            this.numeroQuarto = numeroQuarto;
            return this;
        }

        public ReservaBuilder setDias(int dias) {
            this.dias = dias;
            return this;
        }

        public Reserva build() {
            return new Reserva(this);
        }
    }
}
