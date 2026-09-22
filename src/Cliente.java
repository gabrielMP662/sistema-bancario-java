public class Cliente {
    int id;
    String nome;
    String cpf;

    public Cliente(int id, String nome, String cpf){
        this.cpf = cpf;
        this.id = id;
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
