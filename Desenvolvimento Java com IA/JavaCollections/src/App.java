import list.OperacoesBasicas.ListaTarefa;
import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /* ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("");
        System.out.println("Total: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("Total: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("Total: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas(); */

       // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();
        
        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {
            int senha = scanner.nextInt();
            int confirmacaoSenha = scanner.nextInt();
            CofreDigital cofre = new CofreDigital(senha);
            cofre.imprimirInformacoes();
            if(cofre.validarSenha(confirmacaoSenha)){
                System.out.println("Cofre aberto!");
            } else {
                System.out.println("Senha incorreta!");
            }
        } else {
            CofreFisico cofre = new CofreFisico();
            cofre.imprimirInformacoes();
        }
    }
}

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;
  
    public Cofre(String tipo, String metodoAbertura) {
      this.tipo = tipo;
      this.metodoAbertura = metodoAbertura;
    }
  
    public void imprimirInformacoes() {
      System.out.println("Tipo: " + this.tipo);
      System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
  }
  
  class CofreDigital extends Cofre {
  
    private int senha;
  
    public CofreDigital(int senha) {
      super("Cofre Digital", "Senha");
      this.senha = senha;
    }
  
    public boolean validarSenha(int confirmacaoSenha) {
      return confirmacaoSenha == this.senha;
    }
  }
  
  class CofreFisico extends Cofre {
  
    public CofreFisico() {
      super("Cofre Fisico", "Chave");
    }
  
  }