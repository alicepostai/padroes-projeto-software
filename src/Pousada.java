public class Pousada {
    private static Pousada instance;

    public static Pousada getInstance() {
        if (instance == null) {
            instance = new Pousada();
        }
        return instance;
    }

    public void registrarReserva(Reserva reserva) {
        System.out.println("Reserva registrada: " + reserva);
        Notificacao.getInstance().notificar(reserva);
    }
}
