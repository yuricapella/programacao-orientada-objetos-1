package CodigosEmAula.SistemaPagamentos.Pagamentos;

import java.security.InvalidParameterException;
import java.time.DateTimeException;
import java.time.LocalDate;

public abstract class Pagamento {
    private int codigo;
    private String beneficiario;
    private double valor;
    private LocalDate dataVencimento;

    //static é uma variavel global, então sempre que for Pagamento for intanciado vai aumentar 1 numero, então o contador sempre vai ser unico.
    private static int contador = 1;

    public Pagamento(String beneficiario, double valor, LocalDate dataVencimento) {
        this.codigo = contador++;
        this.beneficiario = beneficiario;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    public void processarPagamento() {
        if(valor <= 0) {
            throw new InvalidParameterException("[Codigo: " + codigo +"] O Valor deve ser maior que zero.");
        }
        if(LocalDate.now().isAfter(dataVencimento)) {
            throw new DateTimeException("[Codigo: " + codigo +"] O pagamento está com a data vencida.");
        }
        processar();
    }

    public int getCodigo() {
        return codigo;
    }

    //public todos vao acessar e nao pode
    //private só a propria classe vai acessar e as filhas nao
    //protected as filhas e oque está dentro do package vai acessar
    //default só quem está dentro do package vao ver.
    //se nada restringe que outras classes vao acessar processar alem dos pagamentos
    //podemos criar um outro pacote dentro de pagamentos que vai ter somente os pagamentos.

    abstract void processar();
}
