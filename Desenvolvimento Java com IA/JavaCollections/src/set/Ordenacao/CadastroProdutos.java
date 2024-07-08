package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        this.produtos.add(new Produto(nome, quantidade, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtos);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtos);
        return produtosPorPreco;
    }

    public static void main(String[] args){
        CadastroProdutos produtos = new CadastroProdutos();
        
        System.out.println();
        System.out.println("-------------");

        produtos.adicionarProduto(1L, "Televisão", 15d, 5);
        produtos.adicionarProduto(2L, "Bicicleta", 10d, 15);
        produtos.adicionarProduto(1L, "Televisão", 20d, 35);
        produtos.adicionarProduto(9L, "Notebook", 25d, 1);

        System.out.println(produtos.produtos);
        System.out.println("-------------");
        System.out.println(produtos.exibirProdutosPorNome());
        System.out.println("-------------");
        System.out.println(produtos.exibirProdutosPorPreco());
    }
}
