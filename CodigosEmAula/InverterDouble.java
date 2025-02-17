package CodigosEmAula;

import java.util.ArrayList;
import java.util.List;

public class InverterDouble {

    public static void main(String[] args) {
        double[] numeros = {1202.40,
                2409.00,
                2565.80,
                1737.50,
                999.60,
                1380.40,
                1697.30,
                1950.50};

        imprimirLista(numeros);

    }
    public static List<Double> inverterListaDouble(double[] numeros) {
        List<Double> listaInvertida = new ArrayList<>();
        for (int i = numeros.length - 1; i >= 0; i--) {
            listaInvertida.add(numeros[i]);
        }
        return listaInvertida;
    }

    public static void imprimirLista(double[] numeros) {
        List<Double> resultado = inverterListaDouble(numeros);
        int contador = 0;
        for (Double d : resultado) {
            System.out.printf("NOTA %d: %.2f\n",contador + 1 ,d);
            contador++;
        }
    }
}
