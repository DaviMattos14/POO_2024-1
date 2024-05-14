
public class Pontuacao {

    private static Pontuacao instance;
    private int pontos;

    private Pontuacao() {
        pontos = 0;
    }

    public static Pontuacao getPontuacao() {
        if (instance == null) {
            instance = new Pontuacao();
        }
        return instance;
    }

    public void ganhaPontos(int ponto) {
        this.pontos += ponto;
    }

    public void getPontos() {
        System.err.println(this.pontos + " pontos \n");
    }
}
