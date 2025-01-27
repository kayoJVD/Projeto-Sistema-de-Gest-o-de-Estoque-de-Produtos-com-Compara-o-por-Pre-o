### README

# Sistema de Gestão de Estoque

O **Sistema de Gestão de Estoque** é uma aplicação Java simples que implementa um sistema de controle de estoque para diferentes categorias de produtos. Ele é organizado em uma estrutura orientada a objetos e possui funcionalidades básicas, como cadastro, listagem e ordenação de produtos.

## Estrutura do Projeto

O projeto é dividido em três principais pacotes:

### 1. **Model**
Contém as classes que representam os modelos de dados, como produtos e suas categorias específicas:
- **Produto**: Classe base que contém atributos comuns a todos os produtos, como `id`, `nome`, `categoria`, `quantidade em estoque` e `preço`.
- **Eletronico**: Subclasse de `Produto` que adiciona atributos específicos, como `marca` e `garantia`.
- **Alimento**: Subclasse de `Produto` que adiciona o atributo `data de validade`.
- **Roupa**: Subclasse de `Produto` que adiciona os atributos `tamanho` e `material`.

### 2. **Controller**
Contém a classe que controla a lógica de gerenciamento de estoque:
- **Estoque**: Classe genérica que armazena e gerencia uma lista de produtos. Oferece funcionalidades como:
  - Adicionar produtos.
  - Listar produtos.
  - Ordenar produtos pelo preço.
  - Encontrar o produto mais barato.

### 3. **View**
Contém a classe principal que interage com o sistema:
- **Main**: Classe responsável por executar o programa. Exemplifica a criação de produtos, adiciona-os ao estoque e realiza a listagem dos itens.

---

## Como Executar o Projeto

### Pré-requisitos
- **Java JDK 8** ou superior.
- Um ambiente de desenvolvimento Java, como **IntelliJ IDEA**, **Eclipse** ou **VS Code**.

### Passos para execução
1. Clone ou faça o download do repositório.
2. Importe o projeto no ambiente de desenvolvimento escolhido.
3. Compile e execute a classe `Main` localizada no pacote `ChatGpt.SistemaDeGestãoDeEstoque.View`.

---

## Funcionalidades

1. **Adicionar Produtos**
   - Produtos podem ser cadastrados no estoque com os atributos relevantes para sua categoria.

2. **Listar Produtos**
   - Exibe todos os produtos cadastrados no estoque.

3. **Ordenar Produtos por Preço**
   - Organiza os produtos em ordem crescente de preço.

4. **Produto Mais Barato**
   - Retorna o produto com o menor preço cadastrado.

---

## Exemplo de Uso

A seguir, um exemplo de execução da classe `Main`:

```java
Estoque<Produto> estoque = new Estoque<>();
estoque.addProducts(new Eletronico(1, "Smartphone", 100, "Iphone", "3 meses", 15000));
estoque.addProducts(new Alimento(2, "Café", 10, "1 ano", 30));
estoque.addProducts(new Roupa(3, "Camisa", 100, "Tamanho GG", "Malha Pima", 70));

estoque.listProducts();
```

**Saída esperada:**
```
[Produto{id=1, name='Smartphone', productCategory='Eletronico', stockQuantity=100, price=15000.0}]
[Produto{id=2, name='Café', productCategory='Alimento', stockQuantity=10, price=30.0}]
[Produto{id=3, name='Camisa', productCategory='Roupa', stockQuantity=100, price=70.0}]
```

---

## Estrutura de Classes

### Classe `Produto`
Representa a classe base dos produtos, com atributos e métodos como:
- Atributos:
  - `id`
  - `name`
  - `productCategory`
  - `stockQuantity`
  - `price`
- Métodos principais:
  - `equals` e `hashCode`: Para garantir unicidade com base no `id`.
  - `compareTo`: Para ordenar produtos por preço.
  - `toString`: Para exibir detalhes de um produto.

### Subclasses:
- **Eletronico**: Adiciona atributos específicos, como `marca` e `garantia`.
- **Alimento**: Adiciona o atributo `data de validade`.
- **Roupa**: Adiciona atributos `tamanho` e `material`.

---

## Contribuições
Sinta-se à vontade para contribuir com melhorias para este sistema. Sugestões e novos recursos são bem-vindos!

---

## Licença
Este projeto é distribuído sob a licença MIT. Sinta-se à vontade para usá-lo e modificá-lo conforme necessário.

--- 
