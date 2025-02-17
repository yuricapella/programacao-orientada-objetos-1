package Lista_De_Exercicios_01.Exercicio_Pratico_01;

public class Solution {
    public static void main(String[] args) {
        String matricula = "123456789";
        double nota1 = 7;
        double nota2 = 2;
        double nota_trabalho = 7;

        String resultado = verificarPromocaoAluno(matricula,nota1,nota2,nota_trabalho);
        System.out.printf(resultado);
    }

    public static double calcularMediaFinal(String matricula, double nota1, double nota2, double nota_trabalho) {
        return (nota1 + nota2 + nota_trabalho)/3;
    }
    public static String verificarPromocaoAluno(String matricula, double nota1, double nota2, double nota_trabalho) {
        double X = calcularMediaFinal(matricula,nota1,nota2, nota_trabalho);
        if(X >= 7){
            return String.format("Aluno aprovado com média %.2f",X);
        }else {
            return String.format("Aluno reprovado com média %.2f",X);
        }
    }
}
