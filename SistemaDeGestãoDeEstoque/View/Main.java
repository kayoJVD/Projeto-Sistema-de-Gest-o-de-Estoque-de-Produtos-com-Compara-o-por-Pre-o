package ChatGpt.SistemaDeGestãoDeEstoque.View;

import ChatGpt.SistemaDeGestãoDeEstoque.Controller.Estoque;
import ChatGpt.SistemaDeGestãoDeEstoque.Model.Alimento;
import ChatGpt.SistemaDeGestãoDeEstoque.Model.Eletronico;
import ChatGpt.SistemaDeGestãoDeEstoque.Model.Produto;
import ChatGpt.SistemaDeGestãoDeEstoque.Model.Roupa;

public class Main {
    public static void main(String[] args) {
        Estoque<Produto> estoque = new Estoque<>();
        estoque.addProducts(new Eletronico(1, "Smartphone", 100, "Iphone", "3 meses", 15000));
        estoque.addProducts(new Alimento(2, "Café", 10, "1 ano", 30));
        estoque.addProducts(new Roupa(3, "Camisa", 100, "Tamanho GG", "Malha Pima", 70));

        estoque.listProducts();

    }
}
