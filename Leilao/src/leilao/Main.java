package leilao;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Participante participante = new Participante("João", "joao@gmail.com", "senha123");

        System.out.println("Login do participante: " + participante.loginParticipante("joao@gmail.com", "senha123"));

        Itemleilao item = new Itemleilao("Livro", "Descrição do livro", "caminho/foto/livro.jpg", 50.0);

        System.out.println("Informações do item: " + item.consultarItem());

        System.out.println("Arrematar o item: " + item.arrematarItem());

        Date dataInicio = new Date();
        Date dataFim = new Date();
        Date horaInicio = new Date();
        Date horaFim = new Date();
        Leilao leilao = new Leilao(dataInicio, dataFim, horaInicio, horaFim);

        System.out.println("Informações do leilão: " + leilao.consultarLeilao());

        System.out.println("Iniciar o leilão: " + leilao.iniciarLeilao());

        System.out.println("Finalizar o leilão: " + leilao.finalizarLeilao());
    }
}
