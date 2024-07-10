package map.Ordenacao;

public class Evento {
    private String evento;
    private String atracao;

    public Evento(String evento, String atracao) {
        this.atracao = atracao;
        this.evento = evento;
    }

    public String getEvento() {
        return evento;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Evento [evento=" + evento + ", atracao=" + atracao + "]";
    }

    
}
