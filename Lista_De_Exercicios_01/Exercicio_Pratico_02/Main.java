package Lista_De_Exercicios_01.Exercicio_Pratico_02;

public class Main {
    public static void main(String[] args) {

        NotaFiscal nota = new NotaFiscal();
        for (int i = 0; i < 10; i++) {
            Produto produto = new Produto("132" +i,13.22,5);
            nota.adicionarProduto(produto);
            if (i == 4){
                nota.removerProdutos(produto.codigo);
            }
        }
        System.out.println(nota.getProdutos().size());

        System.out.println(nota.calcularValorNotaFiscal());

    }
}
