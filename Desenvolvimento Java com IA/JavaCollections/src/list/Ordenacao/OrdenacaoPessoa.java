package list.Ordenacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class OrdenacaoPessoa {

    private List<Pessoa> listaPessoas;


    public OrdenacaoPessoa() {
        this.listaPessoas = new ArrayList<>();
    }

    /**
     * Methods
     */

    public void adicionarPessoa(String nome, int idade, double altura){
        this.listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordernarPorIdade(){
        List<Pessoa> listaPorIdade = new ArrayList<>(this.listaPessoas);
        Collections.sort(listaPorIdade);
        return listaPorIdade;
    }
    
    public List<Pessoa> ordernarPorAltura(){
        List<Pessoa> listaPorAltura = new ArrayList<>(this.listaPessoas);
        Collections.sort(listaPorAltura, new ComparadorPorAltura());
        return listaPorAltura;
    }


    /*
     * Getters
     */

    public List<Pessoa> getListaPessoas() {
        return this.listaPessoas;
    }

    public void setListaPessoas(List<Pessoa> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }

}
