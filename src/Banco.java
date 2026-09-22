import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    }
    public void cadastrarConta(Conta novaConta){
        for(Conta contaCadastrada : contas){
            if (contaCadastrada.getNumero() == novaConta.getNumero()){
                System.out.println("Conta ja existe");
                return;
            }
            }
        contas.add(novaConta);

    }
    public Conta buscarConta(int numero){
        for (Conta contaCadastrada: contas){

            if(contaCadastrada.getNumero() == numero){
                return contaCadastrada;
            }
        }
        return null;
    }
    public void listarContas(){
        for (Conta conta : contas) {
           System.out.println(conta.getCliente().getNome());
           System.out.println(conta.getNumero());
           System.out.println(conta.getSaldo());
        }
    }
    public void realizarDeposito(int numero, float valor){
        Conta conta = buscarConta(numero);
        if (conta == null){
            System.out.println("Conta n encontrada");
            return;
        }
        conta.depositar(valor);

    }
    public void realizarSaque(int numero, float valor){
        Conta conta = buscarConta(numero);
        if (conta == null){
            System.out.println("Conta nao encontrada");
            return;
        }
        conta.sacar(valor);
    }

    }

