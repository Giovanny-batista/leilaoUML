package leilao;

import java.util.Date;

public class Lance {
 
    private double valor;
    private Date momento;

    public Lance(double valor, Date momento) {
        this.valor = valor;
        this.momento = momento;
    }

    public double getValor() {
        return valor;
    }

    public Date getMomento() {
        return momento;
    }

    public void registrarLance(double novoValor, Date novoMomento) {
        this.valor = novoValor;
        this.momento = novoMomento;
    }
}
