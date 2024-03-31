import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    // Construtor
    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void addContato(Contato contato) {
        contatos.add(contato);
    }

    // Buscar e comparar pelo nome
    public Contato buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }

    // Exibir as informações de todos os contatos da agenda
    public void exibirTodosContatos() {
        if (contatos.isEmpty()) {
            System.out.println("\n### A agenda está vazia. ###");
        } else {
            System.out.println("\n### Lista de contatos ###");
            for (Contato contato : contatos) {
                contato.exibirInfo();
            }
        }
    }

    //Remover contato da agenda
    public void removerContato(String nome) {
        Contato contatoRemover = null;
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contatoRemover = contato;
                break;
            }
        }
        if (contatoRemover != null) {
            contatos.remove(contatoRemover);
            System.out.println("\n## Contato removido com sucesso. ##");
        } else {
            System.out.println("\n## Contato não encontrado. ##");
        }
    }
    
}
