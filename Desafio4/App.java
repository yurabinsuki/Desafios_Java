/* 
 Exercício 04 - Enunciado
Em um mundo cada vez mais digital, um grupo de amigos apaixonados por videogames perceberam uma oportunidade de combinar seus hobbies com a prática de programação. Eles decidem criar um sistema para gerenciar perfis de jogadores em seus jogos favoritos, algo que permitiria acompanhar o progresso, as conquistas e as estatísticas de cada jogador de forma personalizada e automatizada.

~~~~ O sistema deve permitir a criação de perfis de jogadores, armazenando informações como nome, pontuação e nível. Além disso, deve ser possível atualizar a pontuação e o nível dos jogadores no sistema. ~~~~

 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("~~~ Java's Bizarre Adventures ~~~");

        Scanner leitor = new Scanner(System.in);
        List<Jogador> guilda = new ArrayList<Jogador>();

        System.out.println("~~Deseja criar quantos jogadores?");
        int quantidade = Integer.parseInt(leitor.nextLine());

        for(int i = 0; i < quantidade; i++) {
            Jogador novoJogador = new Jogador();

            System.out.println("\n~~Digite o nome: ");
            novoJogador.setNome(leitor.nextLine());

            System.out.println("\n~~Digite o nível: ");
            novoJogador.setNivel(leitor.nextInt());

            System.out.println("\n~~Digite a pontuação: ");
            novoJogador.setPontuacao(leitor.nextFloat());

            guilda.add(novoJogador);
            leitor.nextLine(); 
        }

        System.out.println("\n~~~ Exibindo todos os jogadores e pontuações ~~~");
        for(int i = 0; i < guilda.size(); i++) {
            guilda.get(i).mostrar();
        }

        String resposta = "";

        while (!resposta.equals("alterar") && !resposta.equals("sair")) {

            System.out.println("\n~~Caso queira alterar um status, digite 'alterar'");
            System.out.println("~~Para encerrar programa, digite 'sair'");
            resposta = leitor.nextLine();

            if (resposta.equals("alterar")) {
                System.out.println("~~Digite o 'nome' do jogador que queira alterar: ");
                String nomeJogador = leitor.nextLine();

                boolean jogadorEncontrado = false;

                for (Jogador jogador : guilda) {
                    if (jogador.getNome().equalsIgnoreCase(nomeJogador)) {
                        jogador.mostrar();
                        jogadorEncontrado = true;
                        
                        System.out.println("\n~~O que você deseja alterar?");
                        System.out.println("1. Nome");
                        System.out.println("2. Nível");
                        System.out.println("3. Pontuação");
                        int opcao = leitor.nextInt();
                        leitor.nextLine();
                        
                        switch (opcao) {
                            case 1:
                                System.out.println("~~Digite o novo nome: ");
                                String novoNome = leitor.nextLine();
                                jogador.setNome(novoNome);
                                break;
                            case 2:
                                System.out.println("~~Digite o novo nível: ");
                                int novoNivel = leitor.nextInt();
                                jogador.setNivel(novoNivel);
                                break;
                            case 3:
                                System.out.println("~~Digite a nova pontuação: ");
                                float novaPontuacao = leitor.nextFloat();
                                jogador.setPontuacao(novaPontuacao);
                                break;
                            default:
                                System.out.println("~~Opção inválida.");
                                break;
                        }
                        jogador.mostrar();
                        
                        break; 
                    }
                }
                
                if (!jogadorEncontrado) {
                    System.out.println("\n~~~Jogador não encontrado~~~");
                }
            } 
            
        }

            leitor.close();

    }
}
