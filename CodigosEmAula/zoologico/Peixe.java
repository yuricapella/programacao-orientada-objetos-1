package CodigosEmAula.zoologico;

public class Peixe extends Animal {
    public Peixe(TipoPeixe tipo, String comprimento, String cor, String velocidade, String caracteristicas) {
        super(tipo.toString(), comprimento, cor, 0, velocidade, caracteristicas);
    }
}
