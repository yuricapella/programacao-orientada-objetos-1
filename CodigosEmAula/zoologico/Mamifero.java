package CodigosEmAula.zoologico;

public class Mamifero extends Animal{
    public Mamifero(TipoMamifero tipo, String comprimento, String cor, int patas, String velocidade, String caracteristicas) {
        super(tipo.toString(), comprimento, cor, patas, velocidade, caracteristicas);
    }
}
