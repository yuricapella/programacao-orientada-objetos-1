package CodigosEmAula.Veiculos;

public class CarroEletrico extends VeiculoComPortas {
    int cargaBateria;

    public CarroEletrico(String cor, String modelo, String placa, int ano, int portas, int cargaBateria) {
        super(cor, modelo, placa, ano, portas);
        this.cargaBateria = cargaBateria;
    }

    public void recarregar(){
        System.out.println("Recarregando carro");
    }

    public void abastecer(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
