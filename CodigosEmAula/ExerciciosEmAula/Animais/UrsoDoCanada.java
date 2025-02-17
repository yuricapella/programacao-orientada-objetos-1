package CodigosEmAula.ExerciciosEmAula.Animais;

public class UrsoDoCanada extends Animal{
    public UrsoDoCanada(String comprimento, int patas, String cor, String ambiente, String velocidade, String caracteristicas) {
        super(comprimento, patas, cor, ambiente, velocidade, caracteristicas);
    }

    @Override
    public String toString() {
        return "UrsoDoCanada " + super.toString();
    }
}
