public class Carro {

    //‘marca’, ‘modelo’, ‘ano’, ‘placa’ e ‘velocidadeAtual’

    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private float velocidadeAtual;

    Carro(String marca, String modelo, int ano, String placa, float velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = velocidadeAtual;
    }

    Carro() {
        System.out.println("~~~ Registrando carro ~~~");
    }

    // Status do carro
    void statusCarro(){
        System.out.println("\n**************************");
        System.out.println("~~ Marca " + this.getMarca() + " ~~");
        System.out.println("~~ Modelo " + this.getModelo() + " ~~");
        System.out.println("~~ Ano " + this.getAno() + " ~~");
        System.out.println("~~ Placa " + this.getPlaca() + " ~~");
        System.out.println("~~ Velocidade " + this.getVelocidadeAtual() + "km/h ~~");
        System.out.println("**************************\n");
    }


    // GETs e SETs

    String getMarca() {
        return this.marca;
    }

    void setMarca(String marca) {
        this.marca = marca;
    }

    String getModelo() {
        return this.modelo;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    int getAno() {
        return this.ano;
    }

    void setAno(int ano) {
        this.ano = ano;
    }

    String getPlaca() {
        return this.placa;
    }

    void setPlaca(String placa) {
        this.placa = placa;
    }


    float getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    // Frear e Acelerar

    public void Frear() {
        velocidadeAtual -= 10;

        if(this.getVelocidadeAtual() >= 10){
            this.setVelocidadeAtual(this.getVelocidadeAtual() - 10);
            System.out.println("Velocidade do carro " + marca + " reduzido para: " + velocidadeAtual);
        } else {
            System.out.println("~~ O carro está parado ~~");
        }

    }

    public void Acelerar() {
        velocidadeAtual += 10;
        System.out.println("~~ Velocidade do carro " + marca + " subindo para: " + velocidadeAtual);
    }
    
}
