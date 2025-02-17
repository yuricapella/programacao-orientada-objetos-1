package CodigosEmAula.ExerciciosEmAula.Animais;

public abstract class Animal {
    private String comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private String velocidade;
    private String caracteristicas;

    public Animal(String comprimento, int patas, String cor, String ambiente, String velocidade,String caracteristicas) {
        this.comprimento = comprimento;
        this.patas = patas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
        this.caracteristicas = caracteristicas;
    }

    public String getComprimento() {
        return comprimento;
    }

    public int getPatas() {
        return patas;
    }

    public String getCor() {
        return cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }
    @Override
    public String toString() {
        return "\n" +
                "comprimento:" + getComprimento() + '\n' +
                "patas:" + getPatas() + '\n' +
                "cor:" + getCor() + '\n' +
                "ambiente:" + getAmbiente() + '\n' +
                "velocidade:" + getVelocidade() + '\n' +
                "caracteristicas:" + getCaracteristicas() + '\n';
    }

}