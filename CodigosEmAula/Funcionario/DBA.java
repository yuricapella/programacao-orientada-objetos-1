package CodigosEmAula.Funcionario;

public class DBA extends Funcionario{
    private String acessos;

    public void migrarBancoDados(){
        System.out.println("Migrando banco de dados...");
    }

    public void normalizarDados(){
        System.out.println("Normalizando dados...");
    }

    public String getAcessos() {
        return acessos;
    }
}
