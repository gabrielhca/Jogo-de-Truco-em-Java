package game;

import players.Jogador;
import pack.Cartas;

import java.util.ArrayList;
import java.util.List;

public class Vaza {
    private final List<Jogada> jogadas;

    public Vaza() {
        jogadas = new ArrayList<>();
    }

    public void adicionarCarta(Jogador jogador, Cartas cartas) {
        // cria uma jogada e adiciona a lista
        Jogada novaJogada = new Jogada(jogador, cartas);
        jogadas.add(novaJogada);
        System.out.println(jogador.getNome() + " jogou " + cartas.getValorNominal());
    }

    public Jogador determinarVencedor() {
        // usa comparação para encontrar a carta de maior valor
        Jogada jogadaVencedora = null;
        for (Jogada jogadaAtual : jogadas) {
            // se a primeira jogada ou se a carta de jogada maior atual for maior que a carta da jogada vencedora
            if (jogadaVencedora == null || isMaior(jogadaAtual.getCartas(), jogadaVencedora.getCartas()))
                jogadaVencedora = jogadaAtual;
        }

        if (jogadaVencedora != null) {
            return jogadaVencedora.getJogador();
        }
        return null;
    }

    private boolean isMaior(Cartas carta1, Cartas carta2) {
        // implementar a logica de comparação de cartas do truco
        return true; // remover apos implementação
    }
}
