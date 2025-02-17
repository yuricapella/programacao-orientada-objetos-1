package CodigosEmAula.SistemaPagamentos;

import CodigosEmAula.SistemaPagamentos.Pagamentos.Pagamento;
import CodigosEmAula.SistemaPagamentos.Pagamentos.PagamentoBoleto;
import CodigosEmAula.SistemaPagamentos.Pagamentos.PagamentoCartão;
import CodigosEmAula.SistemaPagamentos.Pagamentos.PagamentoPix;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeradorLotePagamento {
    private static Random gerador = new Random();

    public static List<Pagamento> gerarLote(int quantidade){
        List<Pagamento> lotePagamentos = new ArrayList<Pagamento>();

        for (int i = 0; i < quantidade; i++) {
            double valor = Math.random();
            int tipoPagamento = gerador.nextInt(3);

            switch (tipoPagamento) {
                case 0: lotePagamentos.add(
                        new PagamentoCartão(Cartao.geradorCartaoAleatorio(),"ITAU",valor, LocalDate.of(2025, 2, 28))
                    );
                    break;
                case 1: lotePagamentos.add(
                        new PagamentoBoleto("ITAU",valor, LocalDate.of(2025, 2, 28))
                    );
                    break;
                case 2: lotePagamentos.add(
                        new PagamentoPix("ITAU",valor, LocalDate.of(2025, 2, 28))
                    );
                    break;

            }
        }
        return lotePagamentos;
    }
}
