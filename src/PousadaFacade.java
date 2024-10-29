public class PousadaFacade {
    private Pousada pousada = Pousada.getInstance();
    private Notificacao notificacao = Notificacao.getInstance();

    public void registrarReserva(String cliente, int numeroQuarto, int dias) {
        Reserva reserva = new Reserva.ReservaBuilder()
                .setCliente(cliente)
                .setNumeroQuarto(numeroQuarto)
                .setDias(dias)
                .build();

        pousada.registrarReserva(reserva);
    }

    public void adicionarNotificacaoFuncionario(Funcionario funcionario) {
        notificacao.adicionarObservador(funcionario);
    }
}
