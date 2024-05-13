enum Numero_Carta {
    A(1), DOIS(2), TRÊS(3), QUARTO(4), CINCO(5), SEIS(6), SETE(7), OITO(8), NOVE(9), DEZ(10), J(11), Q(12), K(13);

    public int valorCarta;

    Numero_Carta(int valor) {
        valorCarta = valor;
    }

    public enum Naipe {
        OUROS(0), ESPADAS(1), PAUS(2), COPAS(3);

        public int naipeCarta;

        Naipe(int valor) {
            naipeCarta = valor;
        }
    }
}