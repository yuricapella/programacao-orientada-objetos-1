package CodigosEmAula.ExerciciosEmAula;

import CodigosEmAula.ExerciciosEmAula.Animais.Animal;
import CodigosEmAula.ExerciciosEmAula.Animais.Camelo;
import CodigosEmAula.ExerciciosEmAula.Animais.Tubarao;
import CodigosEmAula.ExerciciosEmAula.Animais.UrsoDoCanada;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        Animal camelo = new Camelo("150 cm",4,"Amarelo","Terra","2.0 m/s","Cabeça alongada e corcova");
        Animal tubarao = new Tubarao("300 cm",0,"Cinzento","Mar","1.5 m/s","Barbatanas e cauda");
        Animal ursoDoCanada = new UrsoDoCanada("180 cm",4,"Vermelho","Terra","0.5 m/s","Patas grandes e garras longas");

        animals.add(camelo);
        animals.add(tubarao);
        animals.add(ursoDoCanada);

        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
