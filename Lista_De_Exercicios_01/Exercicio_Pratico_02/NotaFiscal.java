package Lista_De_Exercicios_01.Exercicio_Pratico_02;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProdutos(String codigo){
        produtos.removeIf(produto -> produto.codigo.equals(codigo));
    }

    public double calcularValorProduto(Produto produto) {
        double precoUnitario = produto.precoUnitario;
        int quantidade = produto.quantidade;
        return precoUnitario * quantidade;
    }

    public double calcularValorNotaFiscal(){
        double valorTotal = 0.0;
        for(Produto produto : produtos){
            valorTotal += this.calcularValorProduto(produto);
        }
        return valorTotal;
    }

    public List<Produto> getProdutos() {
        return this.produtos;
    }
}
