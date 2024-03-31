import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("### PIZZARIA FREDDY FAZBEAR ###\n");

        Scanner leitor = new Scanner(System.in);
        Pedido pedido = new Pedido(); 

        System.out.println("\n## Digite a opção desejada ##");

        int resposta = -1;

        while (resposta != 0) {
            System.out.println("\n## 1. Realizar um novo pedido");
            System.out.println("## 2. Cancelar um pedido");
            System.out.println("## 3. Gerar Relatório");
            System.out.println("## 4. Adicionar novo sabor ao menu");
            System.out.println("## 0. Encerrar programa ");

            resposta = leitor.nextInt();
            leitor.nextLine();
            
            switch (resposta) {
                case 1:
                    Pedido novoPedido = new Pedido();
                    System.out.println("## Selecione o sabor do pedido:");
                    Pizza.exibirMenu();
                    int subResposta = leitor.nextInt();
                    leitor.nextLine();
                    Pizza pizzaSelecionada = Pizza.getPizza(subResposta);
                    if (pizzaSelecionada != null) {
                        novoPedido.setSabor(pizzaSelecionada.getNome());
                    } else {
                        System.out.println("Sabor inválido!");
                        break;
                    }

                    System.out.println("## Escolha o tamanho (p - pequena (R$25,00), m - média (R$45,00), g - grande (R$65,00)):");
                    String tamanho = leitor.nextLine();
                    novoPedido.setTamanho(tamanho);

                    System.out.println("## Informe o endereço de entrega:");
                    String endereco = leitor.nextLine();
                    novoPedido.setEndereco(endereco);

                    pedido.addPedido(novoPedido);
                    novoPedido.exibirPedido();
                    break;

                case 2:
                    System.out.println("\n## Insira o código do pedido a ser cancelado:");
                    int codigoPedido = leitor.nextInt();
                    pedido.cancelarPedido(codigoPedido);
                    break;

                case 3:
                    pedido.exibirRelatorio();
                    break;

                case 4:
                    System.out.println("\n## Adicionando novo sabor ao menu ##");
                    System.out.println("## Informe o nome do novo sabor:");
                    String novoSaborNome = leitor.nextLine();
                    System.out.println("## Informe os ingredientes do novo sabor:");
                    String novoSaborIngredientes = leitor.nextLine();
                    Pizza.cadastrarPizza(novoSaborNome, novoSaborIngredientes);
                    System.out.println("\n## Novo sabor cadastrado com sucesso! ##");
                    break;

                case 0:
                    System.out.println("\n### Encerrando o programa ###");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        leitor.close();
    }
}
