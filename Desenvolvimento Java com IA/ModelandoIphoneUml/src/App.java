import Celular.Iphone;
import Celular.Xiomi;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        iphone.selecionarMusica("Flashback anos 80");
        iphone.tocar();
        iphone.pausar();

        iphone.exibirPagina("https://www.dio.me/");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        iphone.ligar("11981478963");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        Xiomi xiomi = new Xiomi();
        xiomi.selecionarMusica("Flashback anos 80");
        xiomi.tocar();
        xiomi.pausar();

        xiomi.exibirPagina("https://www.dio.me/");
        xiomi.adicionarNovaAba();
        xiomi.atualizarPagina();

        xiomi.ligar("11981478963");
        xiomi.atender();
        xiomi.iniciarCorreioVoz();

    }
}
