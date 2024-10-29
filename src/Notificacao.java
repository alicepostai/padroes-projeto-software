import java.util.ArrayList;
import java.util.List;

interface Observador {
    void atualizar(Reserva reserva);
}

class Notificacao {
    private static Notificacao instance;
    private List<Observador> observadores = new ArrayList<>();

    public static Notificacao getInstance() {
        if (instance == null) {
            instance = new Notificacao();
        }
        return instance;
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void notificar(Reserva reserva) {
        for (Observador obs : observadores) {
            obs.atualizar(reserva);
        }
    }
}
