import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private static List<Pizza> menu = new ArrayList<>();

    private String nome;
    private String ingredientes;

    public Pizza(String nome, String ingredientes) {
        this.nome = nome;
        this.ingredientes = ingredientes;
    }

    public static void exibirMenu() {
        if (menu.isEmpty()) {
            System.out.println("### Menu vazio. Cadastre novas pizzas. ###");
        } else {
            System.out.println("### Menu de Pizzas ###");
            for (int i = 0; i < menu.size(); i++) {
                System.out.println((i + 1) + ". " + menu.get(i).getNome() + " - Ingredientes: " + menu.get(i).getIngredientes());
            }
        }
    }

    public static void cadastrarPizza(String nome, String ingredientes) {
        Pizza novaPizza = new Pizza(nome, ingredientes); 
        menu.add(novaPizza);
    }

    public static Pizza getPizza(int index) {
        if (index >= 1 && index <= menu.size()) {
            return menu.get(index - 1);
        }
        return null;
    }

    static {
        // Pizzas padrão já cadastradas
        cadastrarPizza("Calabresa", "Calabresa, mussarela, cebola, tomate");
        cadastrarPizza("Mussarela", "Mussarela, tomate, azeitona");
        cadastrarPizza("Frango com Catupiry", "Frango, catupiry, milho, ervilha");
        cadastrarPizza("Doce de Leite", "Leite condensado, doce de leite, queijo ralado");
    }

    public String getNome() {
        return nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }
}
