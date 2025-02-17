package CodigosEmAula.Veiculos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int limiteVeiculos = 2;
        List<Veiculo> veiculosGerados = new ArrayList<>();

        for (int i = 0; i < limiteVeiculos; i++) {
            Carro carro = new Carro("vermelho", "Fusca", "CAR" + i, 1959, 4);
            veiculosGerados.add(carro);

            Caminhao caminhao = new Caminhao("vermelho", "1113", "CAM" + i, 1964, 2, 3);
            veiculosGerados.add(caminhao);

            Onibus onibus = new Onibus("vermelho", "Mercedes-Benz O500", "ONI" + i, 2001, 6,true,true);
            veiculosGerados.add(onibus);

            Moto moto = new Moto("azul", "Honda", "MOT" + i, 2005, true);
            veiculosGerados.add(moto);

            if(i == limiteVeiculos - 1){
                System.out.println("-----CARRO-----");
                carro.ligar();
                carro.abastecer();
                carro.desligar();

                System.out.println("-----CAMINHÃO-----");
                caminhao.ligar();
                caminhao.abastecer();
                caminhao.receberCarga(20);
                caminhao.descarregar(10);
                caminhao.descarregar(10);
                caminhao.desligar();

                System.out.println("-----ONIBUS-----");
                onibus.ligar();
                onibus.abastecer();
                onibus.abrirPortas();
                onibus.fecharPortas();
                onibus.desligar();

                System.out.println("-----MOTO-----");
                moto.darPartida();
                moto.abastecer();

                System.out.println("----------");

            }

        }

//        GerenciadorDeAbastecimento.abastecerVeiculos(veiculosGerados);
        System.out.println("----------");
        MovimentacaoDeVeiculos.movimentar(veiculosGerados);
    }
}
