package map.OperacaoBasica;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agenda;

    public AgendaContatos() {
        this.agenda = new HashMap<>();
    }

    public void adicionarContatos(String nome, Integer telefone){
        agenda.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agenda.isEmpty());
            agenda.remove(nome);
    }

    public void exibirContatos(){
        System.out.println(agenda);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agenda.isEmpty())
            numeroPorNome = agenda.get(nome);

        return numeroPorNome;
    }

    public static void main(String[] args){
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContatos("Thiago", 123456);
        agenda.adicionarContatos("Thiago1", 1234567);
        agenda.adicionarContatos("Thiago12", 1234568);
        agenda.adicionarContatos("Thiago123", 1234569);
        agenda.adicionarContatos("Thiago1234", 12345610);
        agenda.adicionarContatos("Thiago12345", 12345611);

        agenda.exibirContatos();

        agenda.removerContato("Thiago");

        agenda.exibirContatos();

        System.out.println("O número é " + agenda.pesquisarPorNome("Thiago12"));

    }

}
