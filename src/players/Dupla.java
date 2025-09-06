package players;

public class Dupla {
    private final String nome;
    private final Jogador jogador1;
    private final Jogador jogador2;
    private int quedasJogadas;
    private int quedasGanhas;

    public Dupla(String nome, Jogador jogador1, Jogador jogador2) {
        this.nome = nome;
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.quedasJogadas = 0;
        this.quedasGanhas = 0;
    }

    public void adicionarQuedaGanha() {
        quedasJogadas++;
        quedasGanhas++;
    }

    public void adicionarQuedaPerdida() {
        quedasJogadas++;
    }

    public String getNome() {
        return nome;
    }

    public Jogador getJogador1() {
        return jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public int getQuedasJogadas() {
        return quedasJogadas;
    }

    public int getQuedasGanhas() {
        return quedasGanhas;
    }
}