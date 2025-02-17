package Lista_De_Exercicios_01.Exercicio_Pratico_04;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private List<String> senhas;

    public static void main(String[] args) {
        Usuario usuario = new Usuario("senha1");

        System.out.println(usuario.alterarSenha("senha2"));

        System.out.println(usuario.alterarSenha("senha3"));

        System.out.println(usuario.alterarSenha("senha1"));

        System.out.println(usuario.senhas);
    }

    public Usuario(String senhaInicial) {
        this.senhas = new ArrayList<>();
        this.senhas.add(senhaInicial);
    }

    public String alterarSenha(String novaSenha) {
        if (senhas.contains(novaSenha)) {
            return "Senha não pode ser igual as três últimas utilizadas";
        }

        senhas.add(novaSenha);

        if (senhas.size() > 3) {
            senhas.remove(0);
        }
        return "Senha alterada com sucesso";
    }
}
