/*
Exercício 05 - Enunciado
Em uma tranquila cidade conhecida por sua paixão por automobilismo, um grupo de entusiastas de carros clássicos decide organizar um evento para exibir seus veículos. Para tornar o evento mais interessante, eles planejam criar um sistema que permita aos participantes registrarem seus carros,incluindo informações detalhadas e a capacidade de controlar algumas funcionalidades dos carros, como a velocidade.

Motivado por esse evento de carros clássicos, o desafio é desenvolver uma classe `Carro` em Java, aplicando os princípios da orientação a objetos. Este sistema deve permitir aos usuários criarem objetos`Carro` com informações como marca, modelo, ano e velocidade atual. Além disso, os carros devem ter métodos que permitam acelerar e frear, ajustando a velocidade atual de acordo com a ação realizada.

 */


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("~~~ Controle de veículos ~~~");

        // Inserir a MARCA, MODELO, ANO, PLACA e VELOCIDADE
        Carro gol = new Carro("WW", "Gol", 1980, "LLLNLN5", 50);
        Carro mclaren = new Carro("mclaren", "GT", 2021, "POGGERS", 250);

        gol.statusCarro();
        mclaren.statusCarro();

        mclaren.Acelerar();
        mclaren.Acelerar();
        mclaren.Acelerar();
        mclaren.Acelerar();

        mclaren.setVelocidadeAtual(0);
        mclaren.setMarca("Irreconhecivel");
        mclaren.setModelo("Irreconhecivel");

        

        System.out.println("\n** Acidente na pista, reduza a velocidade **\n");
        gol.Frear();
        

        gol.statusCarro();
        mclaren.statusCarro();

    }
}
