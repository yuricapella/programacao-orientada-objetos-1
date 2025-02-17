package CodigosEmAula.SistemaPagamentos.Pagamentos;

import CodigosEmAula.SistemaPagamentos.Cartao;

import java.time.LocalDate;

public class PagamentoCartão extends Pagamento{
    private final Cartao tipoCartao;

    public PagamentoCartão( Cartao tipoCartao, String beneficiario, double valor, LocalDate dataVencimento) {
        super(beneficiario, valor, dataVencimento);
        this.tipoCartao = tipoCartao;

    }

    void processar(){
        System.out.println("[Codigo: " + getCodigo() +", tipo Cartão: "+ tipoCartao+"] O Pagamento foi processado com sucesso.");
    }
}
