import java.util.ArrayList;

public class driver {
    public static void main(String[] args) {
        ArrayList<Carta> maoDoJogador = new ArrayList<>();

        // Gerando 5 cartas aleatórias e adicionando à mão do jogador
        for (int i = 0; i < 5; i++) {
            maoDoJogador.add(FactoryCarta.gerarCarta());
        }

        // Imprimindo as cartas na mão do jogador
        for (Carta carta : maoDoJogador) {
            System.out.println(carta.Imprimir());
        }
    }
}
