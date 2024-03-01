package leilao;

public class Itemleilao {
    
    private String titulo;
    private String descricao;
    private String caminhoFoto;
    private double lanceMinimo;
    private boolean itemArrematado;
    
    public Itemleilao(String titulo, String descricao, String caminhoFoto, double lanceMinimo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.caminhoFoto = caminhoFoto;
        this.lanceMinimo = lanceMinimo;
        this.itemArrematado = false;
    }
    
    public String consultarItem() {
        return "Título: " + titulo + ", Descrição: " + descricao + ", Caminho da Foto: " + caminhoFoto + ", Lance Mínimo: " + lanceMinimo;
    }
    
    public boolean arrematarItem() {
        if (!itemArrematado) {
            itemArrematado = true;
            return true;
        } else {
            return false;
        }
    }
}
