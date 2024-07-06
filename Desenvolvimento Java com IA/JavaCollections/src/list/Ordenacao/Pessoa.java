package list.Ordenacao;

import java.util.Comparator;
public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getAltura() {
        return this.altura;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", idade='" + getIdade() + "'" +
            ", altura='" + getAltura() + "'" +
            "}";
    }
}


public class ComparadorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return Double.compare(o1.getAltura(), o2.getAltura());
    }

    
}
