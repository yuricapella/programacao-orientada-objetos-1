package CodigosEmAula.Veiculos;

import CodigosEmAula.Abastecimento;

public class Caminhao extends VeiculoComPortas implements Abastecimento {
    private int tamanhoCarga;
    private int qtdEixos;

    public Caminhao(String cor, String modelo, String placa, int ano, int portas, int qtdEixos) {
        super(cor, modelo, placa, ano, portas);
        this.qtdEixos = qtdEixos;
    }

    public void receberCarga(int cargaRecebida) {
        tamanhoCarga = this.tamanhoCarga + cargaRecebida;
        System.out.println("Carga recebida: " + tamanhoCarga);
    }

    public void abastecer(){
        System.out.printf("Caminhão %s está abastecendo diesel.\n",placa);
    }

    public void descarregar(int cargaDescarregada) {
        tamanhoCarga = this.tamanhoCarga - cargaDescarregada;
        if (tamanhoCarga == 0) {
            System.out.println("Caminhão totalmente descarregado");
        }else{
            System.out.printf("CodigosEmAula.Caminhao descarregado, cargas restantes: %d\n", tamanhoCarga);
        }

    }
}
