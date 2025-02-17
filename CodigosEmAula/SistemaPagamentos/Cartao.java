package CodigosEmAula.SistemaPagamentos;

import java.util.Random;

public enum Cartao {
    BASIC, GOLD, PLATINUM, BLACK, DIAMOND;

    private static final Random RANDOM = new Random();

    public static Cartao geradorCartaoAleatorio() {
        Cartao[] cartoes = Cartao.values();
        return cartoes[RANDOM.nextInt(cartoes.length)];
    }
}
