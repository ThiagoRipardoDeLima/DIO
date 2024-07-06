package list.Pesquisa;
import java.util.Objects;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;


    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return this.anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public Livro titulo(String titulo) {
        setTitulo(titulo);
        return this;
    }

    public Livro autor(String autor) {
        setAutor(autor);
        return this;
    }

    public Livro anoPublicacao(int anoPublicacao) {
        setAnoPublicacao(anoPublicacao);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Livro)) {
            return false;
        }
        Livro livro = (Livro) o;
        return Objects.equals(titulo, livro.titulo) && Objects.equals(autor, livro.autor) && anoPublicacao == livro.anoPublicacao;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, anoPublicacao);
    }

    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", autor='" + getAutor() + "'" +
            ", anoPublicacao='" + getAnoPublicacao() + "'" +
            "}";
    }
    
    
}
