package ChatGpt.SistemaDeGestãoDeEstoque.Controller;

import ChatGpt.SistemaDeGestãoDeEstoque.Model.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Estoque <T extends Produto>{
    private List<T> products = new ArrayList<>();

    public void addProducts(T product){
        products.add(product);
    }

    public void listProducts(){
        for (T t : products) {
            System.out.println(products);
        }
    }

    public void orderPrice(){
        Collections.sort(products);
    }

    public T getCheapestProduct(){
        return products.stream().min(Comparator.comparingDouble(Produto::getPrice)).orElse(null);
    }
}
