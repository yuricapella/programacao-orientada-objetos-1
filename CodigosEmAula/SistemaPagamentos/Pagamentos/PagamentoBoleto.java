package CodigosEmAula.SistemaPagamentos.Pagamentos;

import java.time.LocalDate;
import java.util.UUID;

public class PagamentoBoleto extends Pagamento{
    private String codigoBarras;

    public PagamentoBoleto(String beneficiario, double valor, LocalDate dataVencimento) {
        super(beneficiario, valor, dataVencimento);
        this.codigoBarras = UUID.randomUUID().toString();
    }

    void processar(){
        System.out.println("[Codigo: " + getCodigo() +", tipo: Boleto"+"] O Pagamento foi processado com sucesso.");
    }
}
