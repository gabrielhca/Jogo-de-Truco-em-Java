package players;

import java.util.ArrayList;
import java.util.List;

public class RegistroJogadores {
    private final List<Jogador> listaDeJogadores;
    private final List<Dupla> listaDeDuplas;

    public RegistroJogadores() {
        listaDeJogadores = new ArrayList<>();
        listaDeDuplas = new ArrayList<>();
    }

    public Jogador cadastrarJogador(String nome) {
        // verifica se o jogador ja existe
        if(encontrarJogador(nome) != null){
            System.out.println("O nome " + nome + " ja esta em uso.");
            return null;
        }

        Jogador novoJogador = new Jogador(nome);
        listaDeJogadores.add(novoJogador);
        System.out.println("Jogador " + nome + " cadastrado.");
        return novoJogador;
    }

    public Jogador encontrarJogador(String nome) {
        for (int i = 0; i < listaDeJogadores.size(); i++) {
            Jogador jogador = listaDeJogadores.get(i);
            // equalsIgnoreCase permite comparar duas strings
            // ignorando se as letras são maiusculas ou minusculas
            if (jogador.getNome().equalsIgnoreCase(nome)) {
                return jogador;
            }
        }
        return null;
    }

    public Dupla cadastrarDupla(String nomeDupla, String nomeJogador1, String nomeJogador2) {
        // encontra jogadores pelo nome
        Jogador jogador1 = encontrarJogador(nomeJogador1);
        Jogador jogador2 = encontrarJogador(nomeJogador2);

        // verifica se os jogadores existem
        if (jogador1 == null || jogador2 == null) {
            System.out.println("Um ou ambos jogadores não foram encontrados.");
            return null;
        }
        // verifica se os jogadores não são os mesmos
        if (jogador1.equals(jogador2)) {
            System.out.println("Uma dupla não pode ser formada por apenas um jogador");
            return null;
        }

        // cria a nova dupla
        Dupla novaDupla = new Dupla(nomeDupla, jogador1, jogador2);
        listaDeDuplas.add(novaDupla);
        System.out.println("Dupla: " + novaDupla.getNome() + " cadastrada.");
        return novaDupla;
    }

    public List<Dupla> getDuplas() {
        return listaDeDuplas;
    }
}
