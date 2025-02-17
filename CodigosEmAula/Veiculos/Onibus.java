package CodigosEmAula.Veiculos;

import CodigosEmAula.Abastecimento;

public class Onibus extends VeiculoComPortas implements Abastecimento {
    private boolean temCatraca;
    private boolean temSinalParada;

    public Onibus(String cor, String modelo, String placa, int ano, int portas, boolean temCatraca, boolean temSinalParada) {
        super(cor, modelo, placa, ano, portas);
        this.temCatraca = temCatraca;
        this.temSinalParada = temSinalParada;
    }

    void abrirPortas(){
        if(temSinalParada){
            System.out.println("Abrindo portas");
            temSinalParada = false;
        }
    }
    void fecharPortas(){
        if(!temSinalParada){
            System.out.println("Portas fechadas");
        }
    }

    public void abastecer(){
        System.out.printf("Onibus %s está abastecendo gás natural.\n",placa);
    }
}
