public class Main {
    public static void main(String[] args) {
        PousadaFacade facade = new PousadaFacade();

        Funcionario f1 = new Funcionario("Julia");
        Funcionario f2 = new Funcionario("Roberta");

        facade.adicionarNotificacaoFuncionario(f1);
        facade.adicionarNotificacaoFuncionario(f2);

        facade.registrarReserva("Alice", 101, 3);
        facade.registrarReserva("Henrique", 102, 6);
    }
}
