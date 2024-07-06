import list.OperacoesBasicas.ListaTarefa;

public class App {
    public static void main(String[] args) throws Exception {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("");
        System.out.println("Total: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("Total: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("Total: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }
}
