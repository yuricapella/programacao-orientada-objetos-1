package CodigosEmAula.ExerciciosEmAula.Animais;

public class Camelo extends Animal{
    public Camelo(String comprimento, int patas, String cor, String ambiente, String velocidade, String caracteristicas) {
        super(comprimento, patas, cor, ambiente, velocidade, caracteristicas);
    }

    @Override
    public String toString() {
        return "Camelo " + super.toString();
    }
}
