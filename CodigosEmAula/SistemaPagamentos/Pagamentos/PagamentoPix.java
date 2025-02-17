package CodigosEmAula.SistemaPagamentos.Pagamentos;

import java.time.LocalDate;
import java.util.UUID;

public class PagamentoPix extends Pagamento{
    private String qrCode;
    private String chave;

    public PagamentoPix(String beneficiario, double valor, LocalDate dataVencimento) {
        super(beneficiario, valor, dataVencimento);
        this.qrCode = UUID.randomUUID().toString();
        this.chave = qrCode.substring(0,4);
    }

    void processar(){
        System.out.println("[Codigo: " + getCodigo() +", tipo: Pix"+"] O Pagamento foi processado com sucesso.");
    }
}
