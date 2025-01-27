package ChatGpt.SistemaDeGestãoDeEstoque.Model;

public class Eletronico extends Produto{
    private String mark;
    private String guarantee;

    public Eletronico(int id, String name, int stockQuantity, String mark, String guarantee, double price) {
        super(id, name, "Eletronico", stockQuantity, price);
        this.mark = mark;
        this.guarantee = guarantee;
    }



    public Eletronico(int id, String name, String productCategory, int stockQuantity, double price, String mark, String guarantee) {
        super(id, name, productCategory, stockQuantity, price);
        this.mark = mark;
        this.guarantee = guarantee;
    }
}
