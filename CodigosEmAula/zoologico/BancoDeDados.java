package CodigosEmAula.zoologico;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    public static List<Animal> dados = new ArrayList<>();

    public static void salvar(Animal animal) {
        dados.add(animal);
    }

    public static void imprimirDados() {
        for (Animal animal : dados) {
            System.out.println(animal);
        }
    }


}
