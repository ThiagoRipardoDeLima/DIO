package Celular;

import AparelhoTelefonico.AparelhoTelefonico;
import NavegadorInternet.NavegadorInternet;
import ReprodutorMusical.ReprodutorMusical;

public class Xiomi implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    private final String aparelho = "Xiomi";
    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println(aparelho + ": musica tocando");
    }

    @Override
    public void pausar() {
        System.out.println(aparelho + ": musica pausada");
    }

    @Override
    public void selecionarMusica(String musica) {        
        System.out.println(aparelho + ": musica "+ musica +" selecionada");
    }

    @Override
    public void exibirPagina(String url) {        
        System.out.println(aparelho + ": exibindo a pagina "+ url);
    }

    @Override
    public void adicionarNovaAba() {        
        System.out.println(aparelho + ": adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println(aparelho + ": atualizando a pagina");
    }

    @Override
    public void ligar(String numero) {
        System.out.println(aparelho + ": discando para o numero "+ numero);
    }

    @Override
    public void atender() {
        System.out.println(aparelho + ": ligação atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println(aparelho + ": iniciando correio de voz");
    }

}
