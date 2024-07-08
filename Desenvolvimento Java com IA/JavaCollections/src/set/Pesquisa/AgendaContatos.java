package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

import set.OperacaoBasica.ConjutoConvidado;

public class AgendaContatos {

    private Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int contato){
        this.contatos.add(new Contato(nome, contato));
    }

    public void exibirContatos(){
        System.out.println(contatos);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome =  new HashSet<>();
        for (Contato c : contatos)
            if(c.getNome().startsWith(nome))
                contatosPorNome.add(c);
        
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatos)
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        
        return contatoAtualizado;
    }

    public static void main(String[] args){
        AgendaContatos contatos = new AgendaContatos();
        
        contatos.exibirContatos();

        contatos.adicionarContato("Thiago ripardo", 21252478);
        contatos.adicionarContato("Thiago lima", 51252478);
        contatos.adicionarContato("Thiago", 61252478);
        contatos.adicionarContato("Thiago silva", 71252478);
        contatos.adicionarContato("Thiago rodrigues", 71252478);
        contatos.adicionarContato("Thiago santos", 81252478);

        contatos.exibirContatos();

        System.out.println(contatos.pesquisarPorNome("thiago"));

        System.out.println("the phone was updated: " + contatos.atualizarNumeroContato("Thiago santos", 0));

    }

}
