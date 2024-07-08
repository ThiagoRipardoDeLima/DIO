package set.OperacaoBasica;

import java.util.Set;
import java.util.HashSet;

public class ConjutoConvidado {

    private Set<Convidado> convidados;

    public ConjutoConvidado() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoDoConvite(int codigoConvite){
        Convidado conviteParaRemover = null;
        for(Convidado c : convidados)
            if(c.getCodigoConvite() == codigoConvite){
                conviteParaRemover = c;
                break;
            }
            
        convidados.remove(conviteParaRemover);
    }

    public int contarConvidados(){
        return convidados.size();
    }

    public void exibirConvidados(){
        System.out.println(convidados);
    }

    public static void main(String[] args){
        ConjutoConvidado convidados = new ConjutoConvidado();
        System.out.println("There're " + convidados.contarConvidados() + " inviters in the list");

        convidados.adicionarConvidado("Thiago", 2);
        convidados.adicionarConvidado("Thiago", 5);
        convidados.adicionarConvidado("Thiago", 6);
        convidados.adicionarConvidado("Thiago", 7);
        convidados.adicionarConvidado("Thiago", 7);
        convidados.adicionarConvidado("Thiago", 8);

        System.out.println("There're " + convidados.contarConvidados() + " inviters in the list");

        convidados.removerConvidadoPorCodigoDoConvite(7);

        System.out.println("There're " + convidados.contarConvidados() + " inviters in the list");

        convidados.exibirConvidados();

    }

}
