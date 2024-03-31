public class Contato {
    private String nome;
    private String telefone;
    private String profissao;

// Construtor
    public Contato(String nome, String telefone, String profissao) {
        this.nome = nome;
        this.telefone = telefone;
        this.profissao = profissao;
    }

    public Contato() {
        System.out.println("\n## Criando um novo contato ##");
    }

// GETs e SETs
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getProfissao() {
        return profissao;
    }

    void setNome(String nome) {
        this.nome = nome;
        System.out.println("#Nome definido para " + nome + "\n");
    }

    void setTelefone(String telefone) {
        this.telefone = telefone;
        System.out.println("#Telefone definido para " + telefone + "\n");
    }

    void setProfissao(String profissao) {
        this.profissao = profissao;
        System.out.println("#Profissão definida para " + profissao + "\n");
    }


// Exibir informações de contato
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Profissão: " + profissao + "\n");
    }
}

