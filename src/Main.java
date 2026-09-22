//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente = new Cliente(1, "gabriel", "184867777777");

        Conta conta = new Conta(1234, 2000, cliente);

        banco.cadastrarConta(conta);
        banco.listarContas();
        banco.realizarSaque(1234, 500);
        banco.listarContas();
        banco.realizarDeposito(1234, 2000);
        banco.listarContas();
    }
}