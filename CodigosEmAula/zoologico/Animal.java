package CodigosEmAula.zoologico;
/*
Entidade JPA / BancoDeDados
Animal precisa ter todas as informações do banco de dados para poder salvar
e podemos abstrair nos filhos caso nao tenham.

*/
public class Animal {
    private String tipo;
    private String comprimento;
    private String cor;
    private int patas;
    private String velocidade;
    private String caracteristicas;


    public Animal(String tipo, String comprimento, String cor, int patas, String velocidade, String caracteristicas) {
        this.tipo = tipo;
        this.comprimento = comprimento;
        this.cor = cor;
        this.patas = patas;
        this.velocidade = velocidade;
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "tipo='" + tipo + '\'' +
                ", comprimento='" + comprimento + '\'' +
                ", cor='" + cor + '\'' +
                ", patas=" + patas +
                ", velocidade='" + velocidade + '\'' +
                ", caracteristicas='" + caracteristicas + '\'' +
                '}';
    }
}


