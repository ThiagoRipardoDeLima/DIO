package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    
    Map<Long, Produto> estoque;

    public EstoqueProdutos() {
        this.estoque = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, double preco, int quantidade){
        estoque.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoque);
    }

    public double calcularValorTotalProduto(){
        double total = 0d;
        if(estoque.isEmpty())
            return total;
        
        for(Produto p : estoque.values()) {
            total += p.getQuantidade() * p.getPreco();
        }

        return total;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for(Produto p : estoque.values()){
            if(p.getPreco() > maiorPreco)
                produtoMaisCaro = p;
        }

        return produtoMaisCaro;
    }

    public static void main(String[] args){
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1L, "Produto A", 5.0, 10);
        estoque.adicionarProduto(2L, "Produto B", 10.0, 5);
        estoque.adicionarProduto(3L, "Produto C", 15.0, 2);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$ " + estoque.calcularValorTotalProduto());

        System.out.println("Produto mais caro " + estoque.obterProdutoMaisCaro());

    }
}
