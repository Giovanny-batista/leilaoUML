package leilao;

import java.util.Date;

public class Leilao {
    private Date dataInicio;
    private Date dataFim;
    private Date horaInicio;
    private Date horaFim;
    
    public Leilao(Date dataInicio, Date dataFim, Date horaInicio, Date horaFim) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }
    
    public String consultarLeilao() {
        return "Data de Início: " + dataInicio + ", Data de Fim: " + dataFim + ", Hora de Início: " + horaInicio + ", Hora de Fim: " + horaFim;
    }
    
    public String iniciarLeilao() {
        return "Leilão iniciado";
    }
    
    public boolean finalizarLeilao() {
        return true;
    }
}
