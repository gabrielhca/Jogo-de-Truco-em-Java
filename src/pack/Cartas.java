package pack;

public class Cartas {
    private Naipe naipe;
    private ValorNominal valorNominal;

    public Cartas (Naipe naipe, ValorNominal valorNominal) {
        this.naipe = naipe;
        this.valorNominal = valorNominal;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public ValorNominal getValorNominal() {
        return valorNominal;
    }

}
