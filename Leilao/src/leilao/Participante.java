package leilao;

public class Participante {
    private String nome;
    private String email;
    private String senha;
    
    public Participante(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    
    public boolean loginParticipante(String email, String senha) {
        return this.email.equals(email) && this.senha.equals(senha);
    }
    
    public boolean registrarParticipante(String nome, String email, String senha) {
        return true;
    }
    
    public String getNome() {
        return nome;
    }
}
