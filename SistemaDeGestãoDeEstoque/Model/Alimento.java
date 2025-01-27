package ChatGpt.SistemaDeGestãoDeEstoque.Model;

public class Alimento extends Produto{
    String expirationDate;

    public Alimento(int id, String name, int stockQuantity, String expirationDate, double price) {
        super(id, name, "Alimento", stockQuantity, price);
        this.expirationDate = expirationDate;
    }
}
