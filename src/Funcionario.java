public class Funcionario implements Observador {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(Reserva reserva) {
        System.out.println("Funcionario(a) " + nome + " notificado da nova reserva: " + reserva);
    }
}