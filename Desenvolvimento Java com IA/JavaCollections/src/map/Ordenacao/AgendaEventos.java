package map.Ordenacao;

import java.time.LocalDate;
import java.util.*;
import java.text.SimpleDateFormat;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        this.eventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventos.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosOrdernados = new TreeMap<>(eventos);
        System.out.println(eventosOrdernados);
    }

    public void obterProximoEvento(){
        Map<LocalDate, Evento> eventosOrdernados = new TreeMap<>(eventos);
        for ( Map.Entry<LocalDate, Evento> entry : eventosOrdernados.entrySet()) {
            if(entry.getKey().isEqual(LocalDate.now()) || entry.getKey().isAfter(LocalDate.now())){
                System.out.println("O próximo evento " + entry.getValue().getEvento() + " acontecerá na data " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args){
        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEvento(LocalDate.now(), "Bulicho", "Shop em dobro");

        agenda.obterProximoEvento();

    }

}
