import java.util.List;
import java.util.ArrayList;

public class Produto {
    
    private String nome;
    private int codigo;
    private int quantidade;
    private float preco;

    private List<Produto> produtos; 

    // Construtor
    public Produto() {
        this.produtos = new ArrayList<>(); 

    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(int codigo) {
        Produto produtoRemovido = null;
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                produtoRemovido = produto;
                break;
            }
        }
        if (produtoRemovido != null) {
            produtos.remove(produtoRemovido);
            System.out.println("\n### Produto removido com sucesso! ###");
        } else {
            System.out.println("\n### Produto não encontrado. ###");
        }
    }

    public Produto buscarProduto(int codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }


    public void exibirInfo() {
        System.out.println("\n## Produto: " + nome);
        System.out.println("## Código: " + codigo);
        System.out.println("## Quantidade em estoque: " + quantidade);
        System.out.println("## Preço: " + preco + "\n");
    }


    public void valorTotal() {
        float totalPreco = 0;
        int totalQuantidade = 0;
    
        for (Produto produto : produtos) {
            totalPreco += produto.getPreco() * produto.getQuantidade();
            totalQuantidade += produto.getQuantidade();
        }

        System.out.println("\n## Quantidade de produtos cadastrados: " + produtos.size());
        System.out.println("## Total de produtos em estoque: " + totalQuantidade);
        System.out.println("## Valor total em estoque: " + totalPreco);
    }

    // GETs e SETs
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        System.out.println("\n## Nome registrado: " + nome + "\n");
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
        System.out.println("\n## Código registrado: " + codigo + "\n");
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        System.out.println("\n## Quantidade registrada: " + quantidade + "\n");
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
        System.out.println("\n## Preço registrado: " + preco + "\n");
    }
}
