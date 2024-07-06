package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listaLivro;

    public CatalogoLivros(String titulo, String autor, int anoPublicacao) {
        this.listaLivro = new ArrayList<>();
    }

    public void adicionarlivro(String titulo, String autor, int anoPublicacao){
        this.listaLivro.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosEncontrados = new ArrayList<>();

        if(listaLivro.isEmpty())
            return livrosEncontrados;

        for (Livro livro : listaLivro) {
            if(livro.getAutor().equalsIgnoreCase(autor))
                livrosEncontrados.add(livro);
        }

        return livrosEncontrados;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosEncontrados = new ArrayList<>();

        if(listaLivro.isEmpty())
            return livrosEncontrados;

        for (Livro livro : livrosEncontrados) {
            if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal)
                livrosEncontrados.add(livro);
        }

        return livrosEncontrados;
    }

    public Livro pesquisarPorTitulo(String titulo){
        if(listaLivro.isEmpty())
            return null;

        for (Livro livro : listaLivro) {
            if(livro.getTitulo().equalsIgnoreCase(titulo))
                return livro;
        }

        return null;
    }

}
