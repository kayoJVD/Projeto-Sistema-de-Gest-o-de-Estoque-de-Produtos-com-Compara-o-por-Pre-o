package ChatGpt.SistemaDeGestãoDeEstoque.Model;

import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private int id;
    private String name;
    private String productCategory;
    private int stockQuantity;
    private double price;

    public Produto(int id, String name, String productCategory, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.productCategory = productCategory;
        this.stockQuantity = stockQuantity;
    }

    public Produto(int id, String name, String productCategory, int stockQuantity, double price) {
        this.id = id;
        this.name = name;
        this.productCategory = productCategory;
        this.stockQuantity = stockQuantity;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return id == produto.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    @Override
    public int compareTo(Produto o) {
        return Double.compare(this.price, o.price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", stockQuantity=" + stockQuantity +
                ", price=" + price +
                '}';
    }
}
