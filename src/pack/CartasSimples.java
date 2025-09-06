package pack;

public class CartasSimples extends Cartas{
    private final ValorSimples valor;

    public CartasSimples(Naipe naipe, ValorSimples valor) {
        super(naipe, valor.getValorNominal());
        this.valor = valor;
    }

    public int getValorNoJogo() {
        return valor.getValorNoJogo();
    }

    public enum ValorSimples{
        // primeiro parametro: peso ou hierarquia de poder da carta no jogo
        // segundo parametro: nome da carta
        QUATRO(1, ValorNominal.QUATRO),  // tres cartas, Copas, Espadas e Ouros
        CINCO(2, ValorNominal.CINCO),    // quatro cartas, uma de cada naipe
        SEIS(3, ValorNominal.SEIS),      // quatro cartas, uma de cada naipe
        SETE(4, ValorNominal.SETE),      // duas cartas, Paus e Espadas
        DAMA(5, ValorNominal.DAMA),      // quatro cartas, uma de cada naipe
        VALETE(6, ValorNominal.VALETE),  // quatro cartas, uma de cada naipe
        REI(7, ValorNominal.REI),        // quatro cartas, uma de cada naipe
        AS(8, ValorNominal.AS),          // tres cartas, Paus, Copas e Ouros
        DOIS(9, ValorNominal.DOIS),      // quatro cartas, uma de cada naipe
        TRES(10, ValorNominal.TRES);    // quatro cartas, uma de cada naipe
        // cada item do enum é um objeto portanto posso definir atributos, construtores e métodos

        // ValorNoJogo é usado como atributo numerico que serve como
        // o criterio para desempate e comparação

        private final int valorNoJogo;
        private final ValorNominal valorNominal;


        ValorSimples(int valor, ValorNominal valorNominal) {
            this.valorNoJogo = valor;
            this.valorNominal = valorNominal;
        }

        public int getValorNoJogo() {
            return valorNoJogo;
        }

        public ValorNominal getValorNominal() {
            return valorNominal;
        }

        // Ao definir o atributo dentro do enum, o torno fixo e imutavel
        // isso evita erros e aumenta a segurança da estrutura

    }

}
