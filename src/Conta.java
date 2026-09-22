public class Conta {
    int numero;
    float saldo;
    Cliente cliente;

    public Conta(int numero, float saldo, Cliente cliente){
        this.saldo = saldo;
        this.cliente = cliente;
        this.numero = numero;
    }
    public void depositar(float valor){
        if(valor <= 0){
            System.out.println("nenhum valor adicionado");
        }else {
            saldo += valor;
        }
    }
    public void sacar(float valor){
        if (valor > saldo ){
            System.out.println("Saldo insuficiente!");
        }else{
            saldo -= valor;
        }

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
