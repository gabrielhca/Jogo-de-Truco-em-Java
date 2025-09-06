package pack;

public class Manilhas extends Cartas{
    private final ValorManilha valor;

    public Manilhas(Naipe naipe, ValorManilha valor) {
        // o valor nominal (nome da carta) é obtido diretamente do enum ValorManilha
        super(naipe, valor.getValorNominal());
        this.valor = valor;
    }

    // metodo para obter o valor da manilha no jogo
    public int getValorNoJogo() {
        return valor.getValorNoJogo();
    }

    // enum aninhado que define a hierarquia e o nome das manilhas
    public enum ValorManilha{
        // primeiro parametro: peso ou hierarquia de poder da carta no jogo
        // segundo parametro: nome da carta
        QUATRO_PAUS(4, ValorNominal.QUATRO),    // Zape
        SETE_COPAS(3, ValorNominal.SETE),
        AS_ESPADAS(2, ValorNominal.AS),         // Espadilha
        SETE_OUROS(1, ValorNominal.SETE);

        private final int valorNoJogo;
        // construir o valor nominal dentro do enum evita uma logica complexa de mapeamento de cada valor
        private final ValorNominal valorNominal;

        ValorManilha(int valor, ValorNominal valorNominal) {
            this.valorNoJogo = valor;
            this.valorNominal = valorNominal;
        }

        public int getValorNoJogo() {
            return valorNoJogo;
        }

        // retorna o nome nomial da carta
        public ValorNominal getValorNominal() {
            return valorNominal;
        }
    }
}

