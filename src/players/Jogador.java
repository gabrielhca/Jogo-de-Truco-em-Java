package players;

public class Jogador {
    private final String nome;
    private int vitoriasTotais;
    private int partidasTotais;

    public Jogador(String nome) {
        this.nome = nome;
        this.vitoriasTotais = 0;
        this.partidasTotais = 0;
    }

    public void adicionarVitoria() {
        this.vitoriasTotais++;
        this.partidasTotais++;
    }

    public void adicionarDerrota() {
        this.partidasTotais++;
    }

    public String getNome() {
        return nome;
    }

    public int getVitoriasTotais() {
        return vitoriasTotais;
    }

    public int getPartidasTotais() {
        return partidasTotais;
    }
}