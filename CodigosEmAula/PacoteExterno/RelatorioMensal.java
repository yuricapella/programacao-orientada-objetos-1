package CodigosEmAula.PacoteExterno;

import CodigosEmAula.Funcionario.Desenvolvedor;
import CodigosEmAula.Funcionario.Funcionario;

import java.util.Scanner;

public class RelatorioMensal {
    public static void main(String[] args) {
        System.out.println("Sistema ajuste de desenvolvedores");
        Scanner entrada = new Scanner(System.in);
        Funcionario dev = new Desenvolvedor();

        boolean continuar = true;
        while (continuar){
            System.out.println("Digite o cargo do desenvolvedor: ");
            try{
                String cargo = entrada.next();
                System.out.println("Digite o salario do desenvolvedor: ");
                double novoSalario = Double.parseDouble(entrada.next());
                dev.setSalario(novoSalario);
                System.out.println("Salario alterado de desenvolvedor: "+dev.getSalario());

                dev.setCargo(cargo,"Desenvolvedor");
                System.out.println("Cargo alterado de desenvolvedor: "+dev.getCargo());
            }catch (NumberFormatException | NullPointerException e){
                System.out.println("ERRO: O salário deve ser apenas numeros.");
                continue;
            }catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }

            System.out.println();
            System.out.println();
            System.out.println("Deseja Continuar? (S/N)");
            continuar = entrada.next().equalsIgnoreCase("s");
        }
        entrada.close();

    }
}
