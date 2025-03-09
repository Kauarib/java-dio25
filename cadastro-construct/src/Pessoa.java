public class Pessoa {
    private String nome;
    private String endereço;
    private String cpf;

    
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public String getCpf() {
        return cpf;
    }
    
}
