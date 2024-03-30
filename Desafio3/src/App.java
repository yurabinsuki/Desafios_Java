/*
 Exercício 03
Em uma pequena cidade, um desenvolvedor entusiasta decide criar um sistema para ajudar a gerenciar as contas bancárias dos cidadãos locais. Com o crescimento da comunidade, ficou evidente a necessidade de um método mais eficiente e seguro para o manejo de transações bancárias, que até então eram feitas manualmente e levavam muito tempo.

Inspirado por essa necessidade comunitária, o objetivo é desenvolver um sistema bancário simples em Java, focando na orientação a objetos. Este sistema permitirá a criação de contas bancárias, cada uma capaz de realizar operações básicas como depósitos, saques e consultas de saldo. O desafio é estruturar o programa de forma que cada conta seja um objeto, refletindo os princípios da programação orientada a objetos.

Dica:
“Projete uma classe `ContaBancaria` que encapsule os atributos de uma conta, como `numeroConta`,`nomeTitular` e `saldo`. Utilize modificadores de acesso para garantir o encapsulamento e a segurança dos dados. Implemente métodos para `depositar(valor)`, `sacar(valor)` e um método que retorne o `saldo` atual da conta. Lembre-se de que cada operação deve ajustar o saldo da conta de acordo com a transação realizada.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n~~~ Gerenciamento de contas bancárias ~~~");
        
        Scanner leitor = new Scanner(System.in);
        List<ContaBancaria> banco = new ArrayList<ContaBancaria>();

        String resposta = "";

        // Deixando o programa rodar e armazenar novos Objs para fins de consulta
        while (!resposta.equals("sair")) {
            System.out.println("\n~~ Para criar nova conta: Digite 'criar' ");
            System.out.println("~~ Para entrar em conta existe: Digite 'entrar' ");
            System.out.println("~~ Para sair do programa: Digite 'sair' ");
            resposta = leitor.nextLine().toLowerCase();

            // Verificação de resposta válida
            while (!resposta.equals("criar") && !resposta.equals("entrar") && !resposta.equals("sair")) {
                System.out.println("\n~~~ 'criar', 'entrar' ou 'sair' ~~~");
                resposta = leitor.nextLine().toLowerCase();
            }

            switch (resposta) {
                case "criar":

                System.out.println("~~~ Criando nova conta ~~~");
                System.out.println("~~Insira o nome do titular da conta");

                String titular = leitor.nextLine();
                ContaBancaria novaConta = new ContaBancaria(titular);

                banco.add(novaConta);

                System.out.println("\n~~~ Conta criada ~~~");
                System.out.println("~~ Titular da conta: " + novaConta.getNomeTitular());
                System.out.println("~~ Seu número de conta é " + novaConta.getNumeroConta());
                System.out.println("~~ Seu saldo atual é de: R$" + novaConta.getSaldo());

                System.out.println("\n~~~ Para realizar operações, entre com sua conta no sistema ~~~");
                    break;

                case "entrar":
                System.out.println("\n~~ Inisra o número da conta ~~ ");

                int acesso = leitor.nextInt();
                boolean contaExistente = false;

                for (ContaBancaria conta : banco) {
                    if (conta.getNumeroConta() == acesso) {
                        contaExistente = true;
                        conta.consultar();

                        System.out.println("\n~~ Para realizar um deposito, digite 'depositar'");
                        System.out.println("~~ Para realizar um saque, digite 'sacar'");
                        System.out.println("~~ Para sair do programa, digite 'sair'");
                        leitor.nextLine();
                        String operacao = leitor.nextLine().toLowerCase();

                        while (!operacao.equals("depositar") && !operacao.equals("sacar") && !operacao.equals("sair")) {
                            System.out.println("~~~ Entrada inválida, insira a operação que deseja realizar ~~~");
                            operacao = leitor.nextLine().toLowerCase();
                        }
                        switch (operacao) {
                            case "depositar":
                                System.out.println("~~~ Depósito ~~~");
                                System.out.println("~~Insira o valor a ser depositado: ");
                                conta.depositar(leitor.nextFloat());

                                System.out.println("~~Para realizar outra operação, entre novamente na conta.");
                                break;

                            case "sacar":
                            System.out.println("~~~ Saque ~~~");
                            System.out.println("~~Insira o valor a ser retirado: ");
                            conta.sacar(leitor.nextFloat());

                            System.out.println("~~Para realizar outra operação, entre novamente na conta.");
                            break;
                        
                            case "sair":
                                resposta = operacao;
                                break;
                        }
                    }
                    //usado Else if só pra desaparecer a mensagem de erro onde a variavel não é utilizada.
                    else if (contaExistente) {
                        System.out.println("\n~~~ Conta inexistente em sistema ~~~");
                    }
                } 
            }
        }
        System.out.println("~~~ Encerrando programa ~~~");

        leitor.close();

    }
}
