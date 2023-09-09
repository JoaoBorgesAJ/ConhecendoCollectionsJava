package List.OperacoesBasicas;

public class Item {
    // Atributos
    private String nome;
    private double preco;
    private int quant;

    public Item(String nome, double preco, int quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuant() {
        return quant;
    }

    public String toString() {
        return "Item{" +
                "Produto: '" + nome + '\'' +
                ", Preço R$ " + preco +
                ", QTD: " + quant +
                '}';
    }
}
