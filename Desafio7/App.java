/*
Exercicio 07 - Enunciado

Um empreendedor que gerencia um mercado local percebe a necessidade de um sistema para gerenciar o estoque de produtos em sua loja. Ele deseja desenvolver um programa em Java que seja capaz de registrar informações sobre os produtos disponíveis, controlar as quantidades em estoque e fornecer funcionalidades básicas de gerenciamento de estoque. O sistema proposto deve permitir que cada produto seja identificado por seu nome, um código único, um preço e a quantidade em estoque.

Os funcionários do mercado devem ser capazes de adicionar novos produtos ao estoque, atualizar as informações de um produto existente e remover produtos do estoque quando necessário. Para facilitar o gerenciamento do mercado, o sistema também deve ser capaz de gerar relatórios sobre o estoque atual, incluindo informações como os produtos disponíveis, a quantidade em estoque e o valor total em estoque.
 */

 import java.util.Scanner;
 import java.util.ArrayList;
 import java.util.List;

 public class App {
     public static void main(String[] args) throws Exception {
         System.out.println("### GERENCIADOR DE ESTOQUE ###");
 
         Scanner leitor = new Scanner(System.in);
         Produto produto = new Produto(); 
         List<Produto> estoque = new ArrayList<Produto>();
 
         System.out.println("\n## Digite a opção desejada ##");
 
         int resposta = 0;
 
         while (resposta != 4) {
             System.out.println("\n## 1. Adicionar produto ao estoque");
             System.out.println("## 2. Remover produto do estoque");
             System.out.println("## 3. Consultar estoque");
             System.out.println("## 4. Encerrar programa ");
 
             resposta = leitor.nextInt();
             leitor.nextLine();
             
             switch (resposta) {
                 case 1:
                     Produto novoProduto = new Produto();
                     System.out.println("## Insira o nome do produto");
                     novoProduto.setNome(leitor.nextLine());
                     
                     System.out.println("## Insira o código do produto");
                     novoProduto.setCodigo(leitor.nextInt());
                     leitor.nextLine();
                     
                     System.out.println("## Insira a quantidade de produtos");
                     novoProduto.setQuantidade(leitor.nextInt());
                     leitor.nextLine();
                     
                     System.out.println("## Insira o valor unitário do produto");
                     novoProduto.setPreco(leitor.nextFloat());
                     leitor.nextLine();
                     
                     produto.addProduto(novoProduto);
                     novoProduto.exibirInfo();
                     break;
 
                 case 2:
                     System.out.print("\n## Insira o código do produto" + "\n");
                     produto.removerProduto(leitor.nextInt());
                     break;
 
                 case 3:
                     System.out.println("\n## 1. Consultar produto específico");
                     System.out.println("## 2. Consultar estoque completo");
                     
                     int subResposta = leitor.nextInt();
                     leitor.nextLine();
 
                     switch (subResposta) {
                         case 1:
                             System.out.println("## Insira o código do produto");
                             int consulta = leitor.nextInt();
 
                             Produto produtoEncontrado = produto.buscarProduto(consulta); 
                             if (produtoEncontrado != null) {
                                 produtoEncontrado.exibirInfo();
                             } else {
                                 System.out.println("\n## Produto não encontrado :/");
                             }
                             break;
 
                         case 2:
                         System.out.println("\n## Consultando estoque ##");
                         for (Produto p : estoque) {
                                p.exibirInfo();
                         }
                         produto.valorTotal();
                            break;

                         default:
                         System.out.println("\n### Opção inválida ###");
                             break;
                     }
                     break;
 
                 case 4:
                 System.out.println("\n### ENCERRANDO PROGRAMA ###");
                     break;
 
                 default:
                     System.out.println("### Opção inválida ###");
                     break;
             }
         }
 
         leitor.close();
     }
 }
 
