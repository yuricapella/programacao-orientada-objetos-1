package Lista_De_Exercicios_01.Exercicio_Pratico_05;

public class Solution {
    public static void main(String[] args) {
        double resultado = Solution.calcularMediaFinal("123",8,8,10);
        System.out.println(String.format("%.2f",resultado));
    }
    public static double calcularMediaFinal(String matricula, double nota1, double nota2, double nota_trabalho) {
        return (nota1 + nota2 + nota_trabalho)/3;
    }
}
