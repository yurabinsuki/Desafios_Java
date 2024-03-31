import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static int proximoCodigo = 1000;
    private int codigo;
    private String sabor;
    private String tamanho;
    private float valor;
    private String endereco;

    private static List<Pedido> pedidos = new ArrayList<>();

    // Construtor
    public Pedido() {
        this.codigo = proximoCodigo++;
    }

    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void cancelarPedido(int codigo) {
        Pedido pedidoCancelado = null;
        for (Pedido pedido : pedidos) {
            if (pedido.getCodigo() == codigo) {
                pedidoCancelado = pedido;
                break;
            }
        }
        if (pedidoCancelado != null) {
            pedidos.remove(pedidoCancelado);
            System.out.println("\n### Pedido " + codigo + " cancelado com sucesso! ###");
        } else {
            System.out.println("\n### Pedido " + codigo + " não encontrado. ###");
        }
    }

    public void exibirPedido() {
        System.out.println("\n## Detalhes do Pedido ##");
        System.out.println("Nº do Pedido: " + codigo);
        System.out.println("Sabor: " + sabor);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Endereço de entrega: " + endereco);
        System.out.println("Valor total: R$" + valor);
    }

    public void exibirRelatorio() {
        float totalPedidos = 0;
        for (Pedido pedido : pedidos) {
            totalPedidos += pedido.getValor();
        }
        float mediaValores = totalPedidos / pedidos.size();
        System.out.println("\n### Relatório de Pedidos ###");
        System.out.println("Total de pedidos realizados: " + pedidos.size());
        System.out.println("Média de valores dos pedidos: R$" + mediaValores);
    }


    private void calcularValor() {
        switch (tamanho) {
            case "p":
                valor = 25;
                break;
            case "m":
                valor = 45; 
                break;
            case "g":
                valor = 65; 
                break;
            default:
                System.out.println("Tamanho inválido!");
                valor = 0; 
        }
    }

// GETs e SETs 
    public int getCodigo() {
        return codigo;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
        calcularValor();
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
