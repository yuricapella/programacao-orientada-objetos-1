package CodigosEmAula.Veiculos;

public abstract class VeiculoComPortas extends Veiculo {
    int portas;

    public VeiculoComPortas(String cor, String modelo, String placa, int ano, int portas) {
        super(cor, modelo, placa, ano);
        this.portas = portas;
    }

    void ligar() {
        System.out.println("Ligando");
    }
    void desligar() {
        System.out.println("Desligando");
    }
}
