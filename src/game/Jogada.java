package game;

import players.Jogador;
import pack.Cartas;

public class Jogada {
    private final Jogador jogador;
    private final Cartas cartas;

    public Jogada (Jogador jogador, Cartas cartas) {
        this.jogador = jogador;
        this.cartas = cartas;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public Cartas getCartas() {
        return cartas;
    }
}
