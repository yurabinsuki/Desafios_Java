
/* Exercício 02 - Enunciado
Imagine uma pequena biblioteca pessoal, uma coleção que você começou a construir com seus livros favoritos. No entanto, com o tempo e o acúmulo de mais e mais livros, você percebe a necessidade de organizar e acessar rapidamente as informações de cada um deles.

~~~~ Para ajudar nessa organização, você decide criar um sistema simples em Java que permitirá registrar cada livro com detalhes cruciais: o título, o autor e o ano de publicação. Além de armazenar esses dados, você quer uma maneira fácil de exibir as informações de qualquer livro da sua coleção, para quando quiser relembrar um título ou sugerir uma leitura a um amigo. ~~~~

*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        System.out.println("~~~ Armazenamento de Livros ~~~");

        Scanner leitor = new Scanner(System.in);
        List<Livro> catalogo = new ArrayList<Livro>();

        String resposta = "";

        while (!resposta.equals("quit")) {
            System.out.println("\n~~ Para consultar um livro, digite 'Consult'");
            System.out.println("~~ Para adicionar um livro, digite 'Add'");
            System.out.println("~~ Para encerrar o programa, digite 'quit': ");
    
            resposta = leitor.next().toLowerCase();
            while (!resposta.equals("consult") && !resposta.equals("add") && !resposta.equals("quit")) {
                System.out.println("Resposta inválida.");
                System.out.println("Digite 'Consult' para consultar ou 'add' para adicionar um livro a lista: ");
                resposta = leitor.next().toLowerCase();
            }
    
            if (resposta.equals("add")) {
                System.out.println("~~ Quantos livros deseja adicionar?");
                int quantidade = leitor.nextInt();
                leitor.nextLine(); 
                for(int i = 0; i < quantidade; i++) {
                    Livro novoLivro = new Livro();
            
                    System.out.println("~~ Insira o título do livro: ");
                    novoLivro.setTitulo(leitor.nextLine());
            
                    System.out.println("~~ Insira o autor do livro: ");
                    novoLivro.setAutor(leitor.nextLine());
            
                    System.out.println("~~ Insira o ano de lançamento do livro: ");
                    novoLivro.setAno(leitor.nextInt());
                    leitor.nextLine(); 
            
                    catalogo.add(novoLivro);
    
                    System.out.println("~~~ Adicionado ao catálogo ~~~");
                }
                for(int i = 0; i < catalogo.size(); i++){
                    catalogo.get(i).exibirInfo();
                }
            }
            
            else if (resposta.equals ("consult")){
                System.out.println("~~~ Qual livro deseja consultar?");
                leitor.nextLine();
                String consulta = leitor.nextLine();
                boolean livroEncontrado = false;
                
                for (Livro livro : catalogo) {
                    if (livro.getTitulo().equalsIgnoreCase(consulta)) {
                        livro.exibirInfo();
                        livroEncontrado = true;
                        break; 
                    }
                }
                
                if (!livroEncontrado) {
                    System.out.println("~~~ Livro não cadastrado ~~~");
                }
            } 
            else {
                System.out.println("~~~ Encerrando programa ~~~");
            }
            
        }
        
        leitor.close();
            
    }
        
}
