/*
Exercício 06 - Enunciado
Inspirado pela organização de um grande evento de networking, onde os participantes trocam contatos e informações profissionais, um desenvolvedor decide criar um sistema para gerenciar uma agenda de contatos. Este sistema ajudará os usuários a manter suas conexões organizadas, permitindo-lhes adicionar, remover e buscar contatos facilmente.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("### Sistema de Contatos ###");

        Scanner leitor = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int resposta = 0;

        System.out.println("\n## Digite a opção desejada ##");

        while (resposta != 4) {
            System.out.println("\n## 1. Consultar contatos");
            System.out.println("## 2. Adicionar novo contato");
            System.out.println("## 3. Remover contato");
            System.out.println("## 4. Encerrar programa");

            resposta = leitor.nextInt();

            switch (resposta) {
                case 1:
                    System.out.println("\n## 1. Consultar contato específico");
                    System.out.println("## 2. Exibir agenda de contatos");

                    int subResposta = leitor.nextInt();

                    switch (subResposta) {
                        case 1:
                            System.out.println("\n## Digite o nome do contato: ");
                            leitor.nextLine();
                            String consulta = leitor.nextLine();

                            Contato contatoEncontrado = agenda.buscarContato(consulta); 
                            if (contatoEncontrado != null) {
                                contatoEncontrado.exibirInfo();
                            } else {
                                System.out.println("Contato não encontrado.");
                            }
                            break;

                        case 2:
                            agenda.exibirTodosContatos();
                            break;

                        default:
                            System.out.println("\nOpção inválida. Tente novamente.");
                            break;
                    }
                    break;

                case 2:
                    Contato novoContato = new Contato();
                    System.out.println("## Digite o nome do novo contato: ");
                    leitor.nextLine();
                    novoContato.setNome(leitor.nextLine());

                    System.out.println("## Digite o telefone do novo contato: ");
                    novoContato.setTelefone(leitor.nextLine());

                    System.out.println("## Digite a profissão do novo contato: ");
                    novoContato.setProfissao(leitor.nextLine());

                    agenda.addContato(novoContato);
                    novoContato.exibirInfo();

                    break;

                case 3:
                    System.out.println("\n## Digite o nome do contato: ");
                    leitor.nextLine();
                    agenda.removerContato(leitor.nextLine());

                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    break;
            }
        }

        leitor.close();
    }
}
