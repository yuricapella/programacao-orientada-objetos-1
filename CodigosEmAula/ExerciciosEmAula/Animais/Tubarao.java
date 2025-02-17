package CodigosEmAula.ExerciciosEmAula.Animais;

public class Tubarao extends Animal{
    public Tubarao(String comprimento, int patas, String cor, String ambiente, String velocidade, String caracteristicas) {
        super(comprimento, patas, cor, ambiente, velocidade, caracteristicas);
    }

    @Override
    public String toString() {
        return "Tubarao " + super.toString();
    }
}
