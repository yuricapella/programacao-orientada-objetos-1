package CodigosEmAula.SistemaPagamentos;


import CodigosEmAula.SistemaPagamentos.Pagamentos.Pagamento;

import java.security.InvalidParameterException;
import java.time.DateTimeException;


public class SistemaPagamento {
    public static void main(String[] args) {
        var lotePagamentos = GeradorLotePagamento.gerarLote(5);
        Cartao.geradorCartaoAleatorio();

        for(Pagamento lote : lotePagamentos){
            try{
                lote.processarPagamento();
            }catch(InvalidParameterException e){
                System.out.println(e.getMessage());
            }catch (DateTimeException e){
                System.out.println(e.getMessage());
            }
        }





    }
//    public static List<Pagamento> gerarPagamentosAntes(int quantidade){
//        //Criar dois pagamentos
//        Pagamento pagCartao = new PagamentoCartão("SHOPPE",150, LocalDate.of(2025, 2, 28));
//        Pagamento pagBoleto = new PagamentoBoleto("SHOPPE",150, LocalDate.of(2025, 2, 28));
//        Pagamento pagPix = new PagamentoPix("SHOPPE",150, LocalDate.of(2025, 2, 28));
//
//        //Criou lista
//        List<Pagamento> lotePagamentos = new ArrayList<>();
//        //Adicionou os pagamentos na lista
//        lotePagamentos.add(pagCartao);
//        lotePagamentos.add(pagBoleto);
//        lotePagamentos.add(pagPix);
//
//        //Percorri a lista realizando o processamento
//        for(Pagamento lote : lotePagamentos){
//            try{
//                lote.processarPagamento();
//            }catch(InvalidParameterException e){
//                System.out.println(e.getMessage());
//            }
//        }
//        return lotePagamentos;
//    }
}
