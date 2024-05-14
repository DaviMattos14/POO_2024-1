public class Driver{

    public static void main(String[] args) {
        Pontuacao p1 = Pontuacao.getPontuacao();
        p1.ganhaPontos(14);
        Pontuacao p2 = Pontuacao.getPontuacao();
        p2.ganhaPontos(10);
        p1.getPontos();
        p2.getPontos();
        /*
        Pontuacao p = new Pontuacao();
        p.ganhaPontos(14);
        p.getPontos();
         */
        if (p1 == p2) {
            System.out.println("p1 e p2 são a mesma instância.");
        } else {
            System.out.println("p1 e p2 são instâncias diferentes. (Isso não deve acontecer)");
        }
    }
}