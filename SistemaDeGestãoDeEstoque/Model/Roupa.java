package ChatGpt.SistemaDeGestãoDeEstoque.Model;

public class Roupa extends Produto{
    private String size;
    private String material;

    public Roupa(int id, String name, int stockQuantity, String size, String material, double price) {
        super(id, name, "Roupa", stockQuantity, price);
        this.size = size;
        this.material = material;
    }
}
