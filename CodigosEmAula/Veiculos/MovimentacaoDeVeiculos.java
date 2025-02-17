package CodigosEmAula.Veiculos;

import java.util.List;

public class MovimentacaoDeVeiculos {

    //COM POLIMORFISMO
    public static void movimentar(List<Veiculo> listaDeVeiculos) {
        for (Veiculo veiculo : listaDeVeiculos) {
            veiculo.mover();
        }
    }
}
