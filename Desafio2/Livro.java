public class Livro {
    
    String titulo;
    String autor;
    int ano;

    Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    Livro() {
        System.out.println("~~~ Adicionando um novo livro ~~~");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    void exibirInfo() {
        System.out.println("\n------------------");
        System.out.println("~~ Titulo: " + titulo);
        System.out.println("\n~~ Autor: " + autor);
        System.out.println("\n~~ Ano de Lançamento: " + ano);
    }

}
