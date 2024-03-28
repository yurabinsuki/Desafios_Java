import java.util.Scanner;

/* ~~~ Desafio 1 ~~~
ENUNCIADO 
 Num mundo repleto de equações e problemas matemáticos, um estudante de programação se depara com o desafio de simplificar suas tarefas diárias. 
 
 Ele percebe que, ao invés de recorrer sempre à calculadora física ou ao celular, poderia praticar suas habilidades de programação criando uma ferramenta personalizada.

 Inspirado por essa necessidade, ele decide desenvolver sua própria calculadora digital em Java. Essa calculadora simplificada deverá realizar as quatro operações matemáticas básicas: adição, subtração, multiplicação e divisão. 
 
 Além disso, ele quer garantir que a calculadora seja fácil de usar, com métodos claramente definidos para cada operação.
 */

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        float resultado = 0;
        String simbolo = "";
        
        System.out.println("~~~ Calcauladora simplificada ~~~");

        System.out.println("Insira o primeiro valor: ");
        float valor1 = scanner.nextFloat();

        System.out.println("Insira o símbolo da operação: ");
        String operacao = scanner.next();
        while (!operacao.equals("+") && !operacao.equals("-") && !operacao.equals("*") && !operacao.equals("/")) {
            System.out.println("Operação inválida, insira no formato: ");
            System.out.println("'+', '-', '*', '/': ");
            operacao = scanner.next();
        }
        
        System.out.println("Insira o segundo valor: ");
        float valor2 = scanner.nextFloat();

        switch (operacao) {
            case "+":
                resultado = calculadora.Adicao(valor1, valor2);
                simbolo = "soma";
                break;

            case "-":
                resultado = calculadora.Subtracao(valor1, valor2);
                simbolo = "subtração";
                break;

            case "*":
                resultado = calculadora.Multiplicacao(valor1, valor2);
                simbolo = "multiplicação";
                break;

            case "/":
                resultado = calculadora.Divisao(valor1, valor2);
                simbolo = "divisão";
                break;
        }

        System.out.println("O resultado da " + simbolo + " é: " + resultado);
        scanner.close();
    }
}
