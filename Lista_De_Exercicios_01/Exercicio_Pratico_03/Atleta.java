package Lista_De_Exercicios_01.Exercicio_Pratico_03;

public class Atleta {
    public String nome;
    protected String dataNascimento;
    private String cpf;
    protected String melhorTempo;
    public int quantidadeParticipacoes;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
